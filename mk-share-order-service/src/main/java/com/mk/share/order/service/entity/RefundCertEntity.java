package com.mk.share.order.service.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RefundCertEntity {
    private Long id;

    private String batchId;

    private String createUserid;

    private Long orderId;

    private String relateOrderId;

    private Integer orderType;

    private Integer status;

    private String memberId;

    private String memberName;

    private String custEmail;

    private String mobileNo;

    private Integer tradeExpired;

    private String bankName;

    private String bankAccount;

    private String provinceCode;

    private String cityCode;

    private String mdseName;

    private String supplierId;

    private String supplierType;

    private Integer refundPointAmount;

    private BigDecimal refundCashAmount;

    private String bankUserName;

    private String errorCode;

    private String errorMsg;

    private Date errorTime;

    private String refundMsg;

    private Date refundProcessTime;

    private Integer pointAmount;

    private BigDecimal cashAmount;

    private Date refundLaunchTime;

    private String spuCode;

    private Long returnGoodsItemId;

    private Integer souceType;

    private String orderCode;

    private String skuCode;

    private String orderItemId;

    private String couponCode;

    private String paymentNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid == null ? null : createUserid.trim();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getRelateOrderId() {
        return relateOrderId;
    }

    public void setRelateOrderId(String relateOrderId) {
        this.relateOrderId = relateOrderId == null ? null : relateOrderId.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public Integer getTradeExpired() {
        return tradeExpired;
    }

    public void setTradeExpired(Integer tradeExpired) {
        this.tradeExpired = tradeExpired;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getMdseName() {
        return mdseName;
    }

    public void setMdseName(String mdseName) {
        this.mdseName = mdseName == null ? null : mdseName.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType == null ? null : supplierType.trim();
    }

    public Integer getRefundPointAmount() {
        return refundPointAmount;
    }

    public void setRefundPointAmount(Integer refundPointAmount) {
        this.refundPointAmount = refundPointAmount;
    }

    public BigDecimal getRefundCashAmount() {
        return refundCashAmount;
    }

    public void setRefundCashAmount(BigDecimal refundCashAmount) {
        this.refundCashAmount = refundCashAmount;
    }

    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName == null ? null : bankUserName.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public Date getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Date errorTime) {
        this.errorTime = errorTime;
    }

    public String getRefundMsg() {
        return refundMsg;
    }

    public void setRefundMsg(String refundMsg) {
        this.refundMsg = refundMsg == null ? null : refundMsg.trim();
    }

    public Date getRefundProcessTime() {
        return refundProcessTime;
    }

    public void setRefundProcessTime(Date refundProcessTime) {
        this.refundProcessTime = refundProcessTime;
    }

    public Integer getPointAmount() {
        return pointAmount;
    }

    public void setPointAmount(Integer pointAmount) {
        this.pointAmount = pointAmount;
    }

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Date getRefundLaunchTime() {
        return refundLaunchTime;
    }

    public void setRefundLaunchTime(Date refundLaunchTime) {
        this.refundLaunchTime = refundLaunchTime;
    }

    public String getSpuCode() {
        return spuCode;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode == null ? null : spuCode.trim();
    }

    public Long getReturnGoodsItemId() {
        return returnGoodsItemId;
    }

    public void setReturnGoodsItemId(Long returnGoodsItemId) {
        this.returnGoodsItemId = returnGoodsItemId;
    }

    public Integer getSouceType() {
        return souceType;
    }

    public void setSouceType(Integer souceType) {
        this.souceType = souceType;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId == null ? null : orderItemId.trim();
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo == null ? null : paymentNo.trim();
    }
}