package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.OrderLogEntity;

public interface OrderLogEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderLogEntity record);

    int insertSelective(OrderLogEntity record);

    OrderLogEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderLogEntity record);

    int updateByPrimaryKey(OrderLogEntity record);
}