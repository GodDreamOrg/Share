package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.ReturnGoodsInfo;

public interface ReturnGoodsInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReturnGoodsInfo record);

    int insertSelective(ReturnGoodsInfo record);

    ReturnGoodsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReturnGoodsInfo record);

    int updateByPrimaryKey(ReturnGoodsInfo record);
}