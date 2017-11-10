package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.ReturnGoodsItemEntity;

public interface ReturnGoodsItemEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReturnGoodsItemEntity record);

    int insertSelective(ReturnGoodsItemEntity record);

    ReturnGoodsItemEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReturnGoodsItemEntity record);

    int updateByPrimaryKey(ReturnGoodsItemEntity record);
}