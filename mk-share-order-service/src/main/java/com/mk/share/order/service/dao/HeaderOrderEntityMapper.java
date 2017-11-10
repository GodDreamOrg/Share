package com.mk.share.order.service.dao;

import com.mk.share.order.service.entity.HeaderOrderEntity;

public interface HeaderOrderEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HeaderOrderEntity record);

    int insertSelective(HeaderOrderEntity record);

    HeaderOrderEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HeaderOrderEntity record);

    int updateByPrimaryKey(HeaderOrderEntity record);
}