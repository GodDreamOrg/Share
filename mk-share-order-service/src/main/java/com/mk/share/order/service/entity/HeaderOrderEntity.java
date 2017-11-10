package com.mk.share.order.service.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HeaderOrderEntity {
    private Long id;

    private Long memberId;

    private String memberName;

    private BigDecimal cashPrice;

    private Integer pointPrice;

    private Integer status;

    private Date paymentSuccTime;

    private Integer paymentType;

    private BigDecimal paidCash;

    private Integer paidPoint;

    private String orderSource;

    private String orderHeadCode;

    private BigDecimal reduceAmount;

    private Integer reducePoint;

    private String promotionCode;

    private Date deadlineTime;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

    private Integer isDeductInventory;

    private Integer executionStatus;

    private String executionName;

    private Integer settleStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public BigDecimal getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(BigDecimal cashPrice) {
        this.cashPrice = cashPrice;
    }

    public Integer getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(Integer pointPrice) {
        this.pointPrice = pointPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPaymentSuccTime() {
        return paymentSuccTime;
    }

    public void setPaymentSuccTime(Date paymentSuccTime) {
        this.paymentSuccTime = paymentSuccTime;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getPaidCash() {
        return paidCash;
    }

    public void setPaidCash(BigDecimal paidCash) {
        this.paidCash = paidCash;
    }

    public Integer getPaidPoint() {
        return paidPoint;
    }

    public void setPaidPoint(Integer paidPoint) {
        this.paidPoint = paidPoint;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public String getOrderHeadCode() {
        return orderHeadCode;
    }

    public void setOrderHeadCode(String orderHeadCode) {
        this.orderHeadCode = orderHeadCode == null ? null : orderHeadCode.trim();
    }

    public BigDecimal getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(BigDecimal reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public Integer getReducePoint() {
        return reducePoint;
    }

    public void setReducePoint(Integer reducePoint) {
        this.reducePoint = reducePoint;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode == null ? null : promotionCode.trim();
    }

    public Date getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(Date deadlineTime) {
        this.deadlineTime = deadlineTime;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getIsDeductInventory() {
        return isDeductInventory;
    }

    public void setIsDeductInventory(Integer isDeductInventory) {
        this.isDeductInventory = isDeductInventory;
    }

    public Integer getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(Integer executionStatus) {
        this.executionStatus = executionStatus;
    }

    public String getExecutionName() {
        return executionName;
    }

    public void setExecutionName(String executionName) {
        this.executionName = executionName == null ? null : executionName.trim();
    }

    public Integer getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Integer settleStatus) {
        this.settleStatus = settleStatus;
    }
}