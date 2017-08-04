package com.mk.share.order.service.base;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * BaseTest抽象配置类
 *
 * @author MonkeyKing
 * @create 2017-08-03 16:32
 */
@ContextConfiguration(locations = {
        "classpath:applicationContext-test.xml"
})
public abstract class BaseTestConfig extends AbstractTestNGSpringContextTests{
}
