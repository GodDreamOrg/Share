package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.ApplySwapOrderEntity;

public interface ApplySwapOrderEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApplySwapOrderEntity record);

    int insertSelective(ApplySwapOrderEntity record);

    ApplySwapOrderEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApplySwapOrderEntity record);

    int updateByPrimaryKey(ApplySwapOrderEntity record);
}