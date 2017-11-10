package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.ReturnGoodsEntity;

public interface ReturnGoodsEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReturnGoodsEntity record);

    int insertSelective(ReturnGoodsEntity record);

    ReturnGoodsEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReturnGoodsEntity record);

    int updateByPrimaryKey(ReturnGoodsEntity record);
}