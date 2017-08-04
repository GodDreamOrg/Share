package com.mk.share.mdse.dubbo;

import com.alibaba.dubbo.container.Main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 商品dubbo服务启动入口
 *
 * @author MonkeyKing
 * @create 2017-08-03 16:15
 */
public class RunApplication {
    public static void main(String[] args) {
        System.out.println((new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]")).format(new Date())+"服务准备启动。。。");
        // 启动服务
        Main.main(args);
    }
}
