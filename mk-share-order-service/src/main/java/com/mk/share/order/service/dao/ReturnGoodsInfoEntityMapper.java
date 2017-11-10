package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.ReturnGoodsInfoEntity;

public interface ReturnGoodsInfoEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReturnGoodsInfoEntity record);

    int insertSelective(ReturnGoodsInfoEntity record);

    ReturnGoodsInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReturnGoodsInfoEntity record);

    int updateByPrimaryKey(ReturnGoodsInfoEntity record);
}