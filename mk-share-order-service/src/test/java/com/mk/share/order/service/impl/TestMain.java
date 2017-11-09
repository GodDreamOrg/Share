package com.mk.share.order.service.impl;

import com.mk.share.order.service.base.TestJunitBaseConfig;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * test main
 *
 * @author wanghao
 * @create 2017-11-07 10:19
 */
public class TestMain extends TestJunitBaseConfig {

    @Test
    public void test01(){
        System.out.println("hello tomcat");
    }

    @Test
    public void test02(){
        ArrayList<String> arrName = new ArrayList<>();
        HashMap<String,Integer> mapNameCount = new HashMap<>();
        for (String str : arrName) {
            if (mapNameCount.containsKey(str)) {
                mapNameCount.put(str,(mapNameCount.get(str).intValue()+1));
            }
            else{
                mapNameCount.put(str,1);
            }
        }
    }
}
