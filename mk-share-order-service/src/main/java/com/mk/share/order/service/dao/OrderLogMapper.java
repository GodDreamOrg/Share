package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.OrderLog;

public interface OrderLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderLog record);

    int insertSelective(OrderLog record);

    OrderLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderLog record);

    int updateByPrimaryKey(OrderLog record);
}