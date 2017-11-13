package com.mk.share.order.service.impl;

import com.mk.share.order.api.enums.OrderEnums;
import com.mk.share.order.api.service.IOrderService;
import com.mk.share.order.api.vo.BuySKUVO;
import com.mk.share.order.api.vo.OrderVO;
import com.mk.share.order.api.vo.SplitOrderVO;
import com.mk.share.order.service.dao.OrderEntityMapper;
import com.mk.share.order.service.dao.OrderItemEntityMapper;
import com.mk.share.order.service.entity.OrderEntity;
import com.mk.share.order.service.entity.OrderItemEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * 订单服务实现类
 *
 * @author v_wanghao
 * @create 2017-08-01 18:30
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderEntityMapper orderEntityMapper;

    @Autowired
    private OrderItemEntityMapper orderItemEntityMapper;

    @Override
    public OrderVO selectByPrimaryKey(Long id) {
        OrderVO result = new OrderVO();
        OrderEntity order = orderEntityMapper.selectByPrimaryKey(id);
        BeanUtils.copyProperties(order, result);
        return result;
    }

    @Override
    public boolean splitOrder(SplitOrderVO splitOrderVO) {
        boolean isOk = false;
        try {
            String orderHeadCode = splitOrderVO.getOrderCode();

            // 1.按照商家拆分订单
            // 拿到所有的商品
            List<BuySKUVO> skuvoList = splitOrderVO.getSkuList();
            if (CollectionUtils.isEmpty(skuvoList)) {
                throw new IllegalArgumentException("参数错误，订单中没有商品");
            }

            // 拆分后的map对象 {key：商户code value：购买的商户商品列表}
            Map<String, List<BuySKUVO>> storeSkuListMap = new HashMap<>();
            for (BuySKUVO buySKUVO : skuvoList) {
                String storeCode = buySKUVO.getStoreCode();
                // 如果map中已有商户 则追加商品
                if (storeSkuListMap.containsKey(storeCode)) {
                    List<BuySKUVO> buySKUVOList = storeSkuListMap.get(storeCode);
                    buySKUVOList.add(buySKUVO);
                }
                // 如果map中没有商户 则创建新的商品列表
                else{
                    List<BuySKUVO> buySKUVOList = new ArrayList<>();
                    buySKUVOList.add(buySKUVO);
                    storeSkuListMap.put(storeCode, buySKUVOList);
                }
            }

            List<OrderEntity> orderEntityList = new ArrayList<>();
            List<OrderItemEntity> orderItemEntityList = new ArrayList<>();

            // 循环拆分订单对象
            for (String key : storeSkuListMap.keySet()) {
                List<BuySKUVO> buySKUVOList = storeSkuListMap.get(key);

                BigDecimal totalPrice = BigDecimal.ZERO;// 订单总现金价
                Integer totalPoint = new Integer(0);// 订单总积分价
                BigDecimal totalRealPrice = BigDecimal.ZERO;// 订单总实付现金价

                // 实例化一个订单持久化对象
                OrderEntity orderEntity = new OrderEntity();

                String orderCode = getRandomSmsCode(16);

                orderEntity.setMemberId(splitOrderVO.getMemberId());
                orderEntity.setMemberName(splitOrderVO.getMemberName());
                orderEntity.setOrderHeadCode(orderHeadCode);
                orderEntity.setOrderCode(orderCode);

                // 循环所有商品 计算价格
                for (BuySKUVO buySKUVO : buySKUVOList) {
                    // 计算单商品总价
                    BigDecimal mdseCashPrice = buySKUVO.getCashPrice().multiply(new BigDecimal(buySKUVO.getQuantity()));
                    Integer mdsePointPrice = buySKUVO.getPointPrice() * buySKUVO.getQuantity();
                    BigDecimal mdseRealPrice = buySKUVO.getRealPrice().multiply(new BigDecimal(buySKUVO.getQuantity()));

                    // 计算订单总价
                    totalPrice = totalPrice.add(mdseCashPrice);
                    totalPoint += mdsePointPrice;
                    totalRealPrice = totalRealPrice.add(mdseRealPrice);

                    // 创建订单详情编号
                    String orderItemCode = getRandomSmsCode(16);

                    // 实例化订单详情持久化对象
                    OrderItemEntity orderItemEntity = new OrderItemEntity();

                    BeanUtils.copyProperties(buySKUVO, orderItemEntity);

                    orderItemEntity.setTotalCashPrice(mdseCashPrice);
                    orderItemEntity.setTotalPointPrice(mdsePointPrice);
                    orderItemEntity.setTotalRealPrice(mdseRealPrice);
                    orderItemEntity.setOrderHeadCode(orderHeadCode);
                    orderItemEntity.setOrderCode(orderCode);
                    orderItemEntity.setOrderItemCode(orderItemCode);

                    orderItemEntityList.add(orderItemEntity);
                }

                orderEntityList.add(orderEntity);
            }
            // 2.持久化订单对象
            for (OrderEntity orderEntity : orderEntityList) {
                orderEntityMapper.insert(orderEntity);
            }
            // 3.持久化订单详情对象
            for (OrderItemEntity orderItemEntity : orderItemEntityList) {
                orderItemEntityMapper.insert(orderItemEntity);
            }

            isOk = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isOk;
    }

    @Override
    public boolean syncDispatching(String orderCode) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setStatus(OrderEnums.Status.TO_DISTRIBUTION.getCode());
        orderEntity.setOrderCode(orderCode);
        int result = orderEntityMapper.updateStatusByOrderCode(orderEntity);
        if (result == 1) {
            return true;
        }
        return false;
    }

    private String getRandomSmsCode(int length) {
        return getRandomSmsCode(length, "");
    }

    private String getRandomSmsCode(int length, String code) {
        if (code.length() == length) {
            return code;
        }
        code += new Random().nextInt(10);
        return getRandomSmsCode(length, code);
    }
}
