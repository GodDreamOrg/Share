package com.mk.share.order.service.base;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wanghao
 * @create 2017-11-07 10:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-test.xml"})
public class TestJunitBaseConfig {
    @Before
    public void before(){
        System.out.println("-------------------");
    }
    @After
    public void after(){
        System.out.println("===================");
    }
}
