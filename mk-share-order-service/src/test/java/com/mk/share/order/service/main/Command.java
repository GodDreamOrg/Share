package com.mk.share.order.service.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Command {
    public static void exeCmd(String commandStr) {  
        BufferedReader br = null;
        try {
            System.out.println("执行命令");
            Process p = Runtime.getRuntime().exec(commandStr);
            System.out.println(1);
            br = new BufferedReader(new InputStreamReader(p.getInputStream(),"UTF-8"));
            String line = null;  
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                System.out.println("result:"+line);
                sb.append(line + "\n");  
            }  
            System.out.println("result:"+sb.toString());
        } catch (Exception e) {  
            e.printStackTrace();  
        }   
        finally  
        {  
            if (br != null)  
            {  
                try {  
                    br.close();  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
  
    public static void main(String[] args) {
        System.out.println("开始");
        String commandStr = "ping www.baidu.com";
        //String commandStr = "ipconfig";  
        Command.exeCmd(commandStr);
    }
}