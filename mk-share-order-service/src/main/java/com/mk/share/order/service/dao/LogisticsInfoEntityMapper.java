package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.LogisticsInfoEntity;

public interface LogisticsInfoEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LogisticsInfoEntity record);

    int insertSelective(LogisticsInfoEntity record);

    LogisticsInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LogisticsInfoEntity record);

    int updateByPrimaryKey(LogisticsInfoEntity record);
}