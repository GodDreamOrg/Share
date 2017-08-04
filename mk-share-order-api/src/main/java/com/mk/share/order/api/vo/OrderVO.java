package com.mk.share.order.api.vo;

import java.util.Date;

/**
 * 订单VO
 *
 * @author MonkeyKing
 * @create 2017-08-01 18:17
 */
public class OrderVO {

    private String orderCode;
    private Date createTime;
    private Long createBy;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }
}
