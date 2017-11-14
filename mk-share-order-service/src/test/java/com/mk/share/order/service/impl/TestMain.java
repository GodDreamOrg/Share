package com.mk.share.order.service.impl;

import com.mk.share.order.service.base.TestJunitBaseConfig;
import com.mk.share.order.service.utils.FileUtil;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
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

    @Test
    public void test03(){
        try {
            InputStream stream = new FileInputStream("G:\\qrcode\\123.jpg");

            PushbackInputStream inputStream = new PushbackInputStream(stream, FileUtil.READ_SIZE);

            String type = FileUtil.getType(inputStream);

            FileOutputStream outputStream = new FileOutputStream("G:\\qrcode\\"+new Date().getTime()+"."+type.toLowerCase());

            byte buf[] = new byte[1024];
            int len;

            while ((len = inputStream.read(buf)) > 0) {
                outputStream.write(buf, 0, len);
            }

            outputStream.close();
            inputStream.close();
            System.out.println(type);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static String bytesToHexString(byte[] src){

        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
}
