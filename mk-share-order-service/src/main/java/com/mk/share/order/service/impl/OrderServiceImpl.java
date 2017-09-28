package com.mk.share.order.service.impl;

import com.mk.share.order.api.service.IOrderService;
import com.mk.share.order.api.vo.OrderVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单服务实现类
 *
 * @author v_wanghao
 * @create 2017-08-01 18:30
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {
    @Override
    public List<OrderVO> queryOrderByMemberId(Long memberId) {
        OrderVO orderVO = new OrderVO();
        orderVO.setOrderCode("12345678");
        orderVO.setCreateBy(memberId);
        List<OrderVO> result = new ArrayList<OrderVO>();
        result.add(orderVO);
        return result;
    }
}
