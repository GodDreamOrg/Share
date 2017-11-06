package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.SettleCert;

public interface SettleCertMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SettleCert record);

    int insertSelective(SettleCert record);

    SettleCert selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleCert record);

    int updateByPrimaryKey(SettleCert record);
}