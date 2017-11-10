package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.OrderEntity;

public interface OrderEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    OrderEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderEntity record);

    int updateByPrimaryKey(OrderEntity record);
}