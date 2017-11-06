package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.RefundCert;

public interface RefundCertMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RefundCert record);

    int insertSelective(RefundCert record);

    RefundCert selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RefundCert record);

    int updateByPrimaryKey(RefundCert record);
}