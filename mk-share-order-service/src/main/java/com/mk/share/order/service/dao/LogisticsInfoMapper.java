package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.LogisticsInfo;

public interface LogisticsInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LogisticsInfo record);

    int insertSelective(LogisticsInfo record);

    LogisticsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LogisticsInfo record);

    int updateByPrimaryKey(LogisticsInfo record);
}