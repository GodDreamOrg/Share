package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.RefundCertEntity;

public interface RefundCertEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RefundCertEntity record);

    int insertSelective(RefundCertEntity record);

    RefundCertEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RefundCertEntity record);

    int updateByPrimaryKey(RefundCertEntity record);
}