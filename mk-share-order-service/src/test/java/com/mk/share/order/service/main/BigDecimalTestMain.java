package com.mk.share.order.service.main;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-09-28 15:56
 */
public class BigDecimalTestMain {
    public static void main(String[] args) {
        int size = 10000;
        calc(10*size);
        calc(100*size);
        calc(1000*size);
        calc(size*size);
    }
    public static void calc(int size){
        System.out.println(String.format("计算总次数为：%s",size));
        Date one = new Date();
        Long a=1000L,b=50L;
        Long c;
        for (int i = 0; i < size; i++) {
            c=new Long(a*100/b);
        }
        Date two = new Date();
        System.out.println(String.format("long计算所用时间：%s",(two.getTime()-one.getTime())));
        one = new Date();
        BigDecimal d = new BigDecimal(1000),e = new BigDecimal(50);
        BigDecimal f = new BigDecimal(0);
        for (int i = 0; i < size; i++) {
            f = d.divide(e,2,BigDecimal.ROUND_HALF_UP);
        }
        two = new Date();
        System.out.println(String.format("BigDecimal计算所用时间：%s",(two.getTime()-one.getTime())));
        System.out.println("==========================================");
    }
}
