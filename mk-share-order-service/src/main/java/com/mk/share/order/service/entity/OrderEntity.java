package com.mk.share.order.service.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderEntity {
    private Long id;

    private Long memberId;

    private String memberName;

    private String relatedMemberId;

    private String channelType;

    private Integer pointPrice;

    private Integer paymentStatus;

    private String mobile;

    private String clientEmail;

    private String failReason;

    private Integer status;

    private BigDecimal cashPrice;

    private Date paymentSuccTime;

    private String remark;

    private Integer paymentType;

    private BigDecimal paidCash;

    private Integer paidPoint;

    private String externalOrderCode;

    private String orderSource;

    private Integer distributionType;

    private String orderCode;

    private String orderHeadCode;

    private String storeCode;

    private String storeName;

    private Integer isAfterSales;

    private Long topActualId;

    private String orderBusinessType;

    private Integer orderTerminal;

    private String supplierCode;

    private String supplierName;

    private String combinedOrderCode;

    private Date deadlineTime;

    private BigDecimal freight;

    private Long createBy;

    private Date createTime;

    private Date updateTime;

    private Long updateBy;

    private Integer executionStatus;

    private String executionName;

    private String offlineStoreCode;

    private String offlineStoreName;

    private Integer executeStatus;

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

    public String getRelatedMemberId() {
        return relatedMemberId;
    }

    public void setRelatedMemberId(String relatedMemberId) {
        this.relatedMemberId = relatedMemberId == null ? null : relatedMemberId.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public Integer getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(Integer pointPrice) {
        this.pointPrice = pointPrice;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail == null ? null : clientEmail.trim();
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(BigDecimal cashPrice) {
        this.cashPrice = cashPrice;
    }

    public Date getPaymentSuccTime() {
        return paymentSuccTime;
    }

    public void setPaymentSuccTime(Date paymentSuccTime) {
        this.paymentSuccTime = paymentSuccTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getExternalOrderCode() {
        return externalOrderCode;
    }

    public void setExternalOrderCode(String externalOrderCode) {
        this.externalOrderCode = externalOrderCode == null ? null : externalOrderCode.trim();
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public Integer getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(Integer distributionType) {
        this.distributionType = distributionType;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderHeadCode() {
        return orderHeadCode;
    }

    public void setOrderHeadCode(String orderHeadCode) {
        this.orderHeadCode = orderHeadCode == null ? null : orderHeadCode.trim();
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getIsAfterSales() {
        return isAfterSales;
    }

    public void setIsAfterSales(Integer isAfterSales) {
        this.isAfterSales = isAfterSales;
    }

    public Long getTopActualId() {
        return topActualId;
    }

    public void setTopActualId(Long topActualId) {
        this.topActualId = topActualId;
    }

    public String getOrderBusinessType() {
        return orderBusinessType;
    }

    public void setOrderBusinessType(String orderBusinessType) {
        this.orderBusinessType = orderBusinessType == null ? null : orderBusinessType.trim();
    }

    public Integer getOrderTerminal() {
        return orderTerminal;
    }

    public void setOrderTerminal(Integer orderTerminal) {
        this.orderTerminal = orderTerminal;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getCombinedOrderCode() {
        return combinedOrderCode;
    }

    public void setCombinedOrderCode(String combinedOrderCode) {
        this.combinedOrderCode = combinedOrderCode == null ? null : combinedOrderCode.trim();
    }

    public Date getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(Date deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
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

    public String getOfflineStoreCode() {
        return offlineStoreCode;
    }

    public void setOfflineStoreCode(String offlineStoreCode) {
        this.offlineStoreCode = offlineStoreCode == null ? null : offlineStoreCode.trim();
    }

    public String getOfflineStoreName() {
        return offlineStoreName;
    }

    public void setOfflineStoreName(String offlineStoreName) {
        this.offlineStoreName = offlineStoreName == null ? null : offlineStoreName.trim();
    }

    public Integer getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(Integer executeStatus) {
        this.executeStatus = executeStatus;
    }
}