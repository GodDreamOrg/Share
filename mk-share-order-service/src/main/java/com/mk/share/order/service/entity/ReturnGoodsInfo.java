package com.mk.share.order.service.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ReturnGoodsInfo {
    private Long id;

    private Long returnGoodsItemId;

    private Integer refundType;

    private Integer refundPoint;

    private BigDecimal refundCash;

    private Integer refundStatus;

    private Long refundSerialNumber;

    private String couponCode;

    private String orderHeadCode;

    private Long updateBy;

    private Long createBy;

    private Date updateTime;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReturnGoodsItemId() {
        return returnGoodsItemId;
    }

    public void setReturnGoodsItemId(Long returnGoodsItemId) {
        this.returnGoodsItemId = returnGoodsItemId;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public Integer getRefundPoint() {
        return refundPoint;
    }

    public void setRefundPoint(Integer refundPoint) {
        this.refundPoint = refundPoint;
    }

    public BigDecimal getRefundCash() {
        return refundCash;
    }

    public void setRefundCash(BigDecimal refundCash) {
        this.refundCash = refundCash;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Long getRefundSerialNumber() {
        return refundSerialNumber;
    }

    public void setRefundSerialNumber(Long refundSerialNumber) {
        this.refundSerialNumber = refundSerialNumber;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    public String getOrderHeadCode() {
        return orderHeadCode;
    }

    public void setOrderHeadCode(String orderHeadCode) {
        this.orderHeadCode = orderHeadCode == null ? null : orderHeadCode.trim();
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}