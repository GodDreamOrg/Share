package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.RewardInfoEntity;

public interface RewardInfoEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RewardInfoEntity record);

    int insertSelective(RewardInfoEntity record);

    RewardInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RewardInfoEntity record);

    int updateByPrimaryKey(RewardInfoEntity record);
}