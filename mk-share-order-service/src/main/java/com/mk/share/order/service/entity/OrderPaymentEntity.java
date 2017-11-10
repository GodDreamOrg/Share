package com.mk.share.order.service.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderPaymentEntity {
    private Long id;

    private String orderHeadCode;

    private String paymentNo;

    private String cxCardNo;

    private BigDecimal payAmount;

    private Date paymentTime;

    private Integer payChannel;

    private Date createTime;

    private String couponCode;

    private Integer payType;

    private Integer pushClearingFlag;

    private Integer reverseFlag;

    private Integer isDisable;

    private Integer payStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderHeadCode() {
        return orderHeadCode;
    }

    public void setOrderHeadCode(String orderHeadCode) {
        this.orderHeadCode = orderHeadCode == null ? null : orderHeadCode.trim();
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo == null ? null : paymentNo.trim();
    }

    public String getCxCardNo() {
        return cxCardNo;
    }

    public void setCxCardNo(String cxCardNo) {
        this.cxCardNo = cxCardNo == null ? null : cxCardNo.trim();
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getPushClearingFlag() {
        return pushClearingFlag;
    }

    public void setPushClearingFlag(Integer pushClearingFlag) {
        this.pushClearingFlag = pushClearingFlag;
    }

    public Integer getReverseFlag() {
        return reverseFlag;
    }

    public void setReverseFlag(Integer reverseFlag) {
        this.reverseFlag = reverseFlag;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }
}