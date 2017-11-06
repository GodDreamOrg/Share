package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.RewardInfo;

public interface RewardInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RewardInfo record);

    int insertSelective(RewardInfo record);

    RewardInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RewardInfo record);

    int updateByPrimaryKey(RewardInfo record);
}