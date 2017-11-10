package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.SettleCertEntity;

public interface SettleCertEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SettleCertEntity record);

    int insertSelective(SettleCertEntity record);

    SettleCertEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleCertEntity record);

    int updateByPrimaryKey(SettleCertEntity record);
}