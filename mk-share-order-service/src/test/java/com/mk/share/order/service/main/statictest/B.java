package com.mk.share.order.service.main.statictest;

/**
 * @author wanghao
 * @create 2017-09-28 16:49
 */
public class B extends A{
    static {
        System.out.println("B static");
    }
    {
        System.out.println("B ");
    }
}
