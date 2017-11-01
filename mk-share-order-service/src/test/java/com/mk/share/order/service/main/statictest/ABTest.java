package com.mk.share.order.service.main.statictest;

import com.mk.share.order.service.utils.DateUtils;

import java.io.IOException;
import java.util.Calendar;

/**
 * @author wanghao
 * @create 2017-09-28 16:51
 */
public class ABTest extends Thread{
    public static void main(String[] args) {
        ABTest test = new ABTest();
        test.start();
    }
    private Calendar calendar = Calendar.getInstance();

    {
        calendar.set(2017,9,30,18,00,00);
    }

    private long currTime = 5000;
    @Override
    public void run() {
        while (true) {
            long time = calendar.getTime().getTime() - Calendar.getInstance().getTime().getTime();
            time = time/1000;
            if (currTime!=0 && currTime!=time) {
                currTime = time;
                System.out.println(String.format("距离下班还有%s秒.",time));
            }
            if (currTime == 0) {
                System.out.println("下班啦！！！");
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
