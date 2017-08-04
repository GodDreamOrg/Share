package com.mk.share.order.dubbo;

import com.alibaba.dubbo.container.Main;


/**
 * 订单中心系统服务启动类
 *
 * @author MonkeyKing
 * @create 2017-08-02 22:12
 */
public class RunApplication {
    public static void main(String[] args) {
        System.out.println("服务器准备启动");
        // 服务器启动
        Main.main(args);
    }
}
