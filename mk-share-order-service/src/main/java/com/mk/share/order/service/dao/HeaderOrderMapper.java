package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.HeaderOrder;

public interface HeaderOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HeaderOrder record);

    int insertSelective(HeaderOrder record);

    HeaderOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HeaderOrder record);

    int updateByPrimaryKey(HeaderOrder record);
}