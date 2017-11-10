package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.OrderItemEntity;

public interface OrderItemEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderItemEntity record);

    int insertSelective(OrderItemEntity record);

    OrderItemEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItemEntity record);

    int updateByPrimaryKey(OrderItemEntity record);
}