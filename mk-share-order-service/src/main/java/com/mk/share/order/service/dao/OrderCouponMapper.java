package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.OrderCoupon;

public interface OrderCouponMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderCoupon record);

    int insertSelective(OrderCoupon record);

    OrderCoupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderCoupon record);

    int updateByPrimaryKey(OrderCoupon record);
}