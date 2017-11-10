package com.mk.share.order.service.impl;

import com.mk.share.order.api.service.IOrderService;
import com.mk.share.order.api.vo.OrderVO;
import com.mk.share.order.service.dao.OrderEntityMapper;
import com.mk.share.order.service.entity.OrderEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 订单服务实现类
 *
 * @author v_wanghao
 * @create 2017-08-01 18:30
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderEntityMapper orderMapper;

    @Override
    public OrderVO selectByPrimaryKey(Long id) {
        OrderVO result = new OrderVO();
        OrderEntity order = orderMapper.selectByPrimaryKey(id);
        BeanUtils.copyProperties(order, result);
        return result;
    }
}
