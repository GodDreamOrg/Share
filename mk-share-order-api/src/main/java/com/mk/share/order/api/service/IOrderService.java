package com.mk.share.order.api.service;

import com.mk.share.order.api.vo.OrderVO;

import java.util.List;

/**
 * 订单接口
 *
 * @author MonkeyKing
 * @create 2017-08-01 18:17
 */
public interface IOrderService {

    List<OrderVO> queryOrderByMemberId(Long memberId);
}
