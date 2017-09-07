package com.mk.share.order.service.main;

/**
 * test1
 *
 * @author wanghao
 * @create 2017-08-15 19:51
 */
public class Test1 {
    public static void main(String[] args) {
        for (int x = 1;x < 10;x++){
            for (int y = 1; y< 10;y++){
                if (y == 5 || y==6){
                    break;
                }else {
                    System.out.println(x+":"+y);
                }
            }
        }
    }
}
