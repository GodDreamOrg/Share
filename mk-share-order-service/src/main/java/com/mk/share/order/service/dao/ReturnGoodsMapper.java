package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.ReturnGoods;

public interface ReturnGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReturnGoods record);

    int insertSelective(ReturnGoods record);

    ReturnGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReturnGoods record);

    int updateByPrimaryKey(ReturnGoods record);
}