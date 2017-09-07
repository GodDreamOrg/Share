package com.mk.share.order.service.main.entity;

/**
 * 猫
 *
 * @author wanghao
 * @create 2017-08-10 13:52
 */
public class Cat extends Animal{

    public void invoke(){
        this.invoke("123");
    }
    
    public String run(String message){
        return "cat:"+message;
    }
}
