package com.mk.share.order.service.impl;

import com.mk.share.mdse.api.service.IMdseService;
import com.mk.share.mdse.api.vo.MdseVo;
import com.mk.share.order.api.service.IOrderService;
import com.mk.share.order.api.vo.OrderVO;
import com.mk.share.order.service.base.BaseTestConfig;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

/**
 * OrderService 服务测试类
 *
 * @author MonkeyKing
 * @create 2017-08-03 16:42
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
public class OrderServiceTest extends BaseTestConfig{
    private static Logger logger = Logger.getLogger(OrderServiceTest.class);

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IMdseService mdseService;

    @Test
    public void orderServiceTest(){
        logger.info("测试服务开始");
        List<OrderVO> orderVOList = orderService.queryOrderByMemberId(123L);
        if (orderVOList != null ){
            for (OrderVO orderVO : orderVOList) {
                System.out.println(orderVO.getCreateBy()+":"+orderVO.getOrderCode());
            }
        }
        logger.info("测试mdseService服务开始");
        List<MdseVo> mdseVoList = mdseService.queryAllMdseVO();
        if (mdseVoList == null || mdseVoList.size() == 0) logger.info("mdseVoList is null Ok?man");
        for (MdseVo mdseVo : mdseVoList) {
            System.out.println(mdseVo.getMdseCode()+":"+mdseVo.getMdseName());
        }
        logger.info("测试服务结束");
    }
}
