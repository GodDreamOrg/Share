package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.ReturnGoodsItem;

public interface ReturnGoodsItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReturnGoodsItem record);

    int insertSelective(ReturnGoodsItem record);

    ReturnGoodsItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReturnGoodsItem record);

    int updateByPrimaryKey(ReturnGoodsItem record);
}