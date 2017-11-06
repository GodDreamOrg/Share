package com.mk.share.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.mk.share.order.service.base.BaseTestConfig;
import com.mk.share.order.service.dao.OrderMapper;
import com.mk.share.order.service.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * @author wanghao
 * @create 2017-11-06 17:57
 */
public class TestOrderImpl extends BaseTestConfig {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void test(){
        Order order = orderMapper.selectByPrimaryKey(1L);
        System.out.println(JSON.toJSONString(order));
    }
}
