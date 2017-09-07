package com.mk.share.order.service.main;

import java.util.HashMap;
import java.util.Map;

/**
 * MainTest
 *
 * @author wanghao
 * @create 2017-08-08 11:05
 */
public class MainTest {
    public static void main(String[] args) {
        String str = "[2016.01.01]人工洗车1次新客专享[9.90元][14241273]";
        //str = str.substring(str.indexOf("[")+1,str.indexOf("]"));
        String[] strings = str.split("[\\[\\]]");
        for (String string : strings) {
            if (string!=null && !"".equals(string))
            System.out.println(":"+string);
        }
        String key = "团购信息单编号".trim();
        Map<String,String> map = new HashMap<>();
        map.put("团购信息单编号","团购信息单编号");
        System.out.println(map.containsKey(key));
    }
}
