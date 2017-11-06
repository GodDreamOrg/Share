package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.OrderPayment;

public interface OrderPaymentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderPayment record);

    int insertSelective(OrderPayment record);

    OrderPayment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderPayment record);

    int updateByPrimaryKey(OrderPayment record);
}