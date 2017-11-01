package com.mk.share.order.service.main.statictest;

/**
 * @author wanghao
 * @create 2017-09-28 16:49
 */
public class A {
    static {
        System.out.println("A static");
    }
    {
        System.out.println("A ");
    }
}
