package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.OrderEntity;

import java.util.List;

/**
 * 订单dao
 *
 * @author MonkeyKing
 * @create 2017-08-01 18:25
 */
public interface IOrderDao {

    List<OrderEntity> queryOrderByMemberId(Long memberId);
}
