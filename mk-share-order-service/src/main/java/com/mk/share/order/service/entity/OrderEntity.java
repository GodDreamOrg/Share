package com.mk.share.order.service.entity;

import java.util.Date;

/**
 * 订单实体类
 *
 * @author v_wanghao
 * @create 2017-08-01 18:26
 */
public class OrderEntity {

    private Long id;
    private String orderCode;
    private Long createBy;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
