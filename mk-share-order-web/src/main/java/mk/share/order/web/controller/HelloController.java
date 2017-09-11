package mk.share.order.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * hello
 *
 * @author wanghao
 * @create 2017-09-10 13:35
 */
public class HelloController {

    @RequestMapping("/hello/index.htm")
    public String hello(){
        return "hello";
    }
}
