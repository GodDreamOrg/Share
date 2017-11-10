package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.OrderCouponEntity;

public interface OrderCouponEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderCouponEntity record);

    int insertSelective(OrderCouponEntity record);

    OrderCouponEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderCouponEntity record);

    int updateByPrimaryKey(OrderCouponEntity record);
}