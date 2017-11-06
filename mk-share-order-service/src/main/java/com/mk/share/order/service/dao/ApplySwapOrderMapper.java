package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.ApplySwapOrder;

public interface ApplySwapOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApplySwapOrder record);

    int insertSelective(ApplySwapOrder record);

    ApplySwapOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApplySwapOrder record);

    int updateByPrimaryKey(ApplySwapOrder record);
}