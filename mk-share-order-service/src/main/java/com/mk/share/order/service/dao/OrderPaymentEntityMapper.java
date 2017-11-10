package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.OrderPaymentEntity;

public interface OrderPaymentEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderPaymentEntity record);

    int insertSelective(OrderPaymentEntity record);

    OrderPaymentEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderPaymentEntity record);

    int updateByPrimaryKey(OrderPaymentEntity record);
}