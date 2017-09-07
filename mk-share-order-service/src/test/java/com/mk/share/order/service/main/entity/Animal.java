package com.mk.share.order.service.main.entity;

/**
 * 动物抽象类
 *
 * @author wanghao
 * @create 2017-08-10 13:49
 */
public abstract class Animal {

    protected void invoke(String message){
        System.out.println(run(message));
    }

    protected String run(String message){
        return "run:"+message;
    }
}
