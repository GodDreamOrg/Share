package com.mk.share.order.service.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SettleCert {
    private Long id;

    private String batchId;

    private Long orderId;

    private String relateOrderId;

    private Integer status;

    private String orderItemId;

    private String mdseName;

    private String settlorName;

    private Integer settlorType;

    private BigDecimal settlePrice;

    private BigDecimal cashPrice;

    private Integer pointPrice;

    private Integer orderStatus;

    private String memberName;

    private Long memberId;

    private String custEmail;

    private String mobileNo;

    private Date settleTime;

    private Integer orderType;

    private String createUserId;

    private Integer orderVersion;

    private String settlorId;

    private Date settleLaunchTime;

    private BigDecimal commissionPrice;

    private BigDecimal contractPrice;

    private String msg;

    private Date processTime;

    private String prmtName;

    private Integer bizType;

    private String spuCode;

    private String settlorCode;

    private String orderCode;

    private String skuCode;

    private Integer quantity;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId == null ? null : orderItemId.trim();
    }

    public String getMdseName() {
        return mdseName;
    }

    public void setMdseName(String mdseName) {
        this.mdseName = mdseName == null ? null : mdseName.trim();
    }

    public String getSettlorName() {
        return settlorName;
    }

    public void setSettlorName(String settlorName) {
        this.settlorName = settlorName == null ? null : settlorName.trim();
    }

    public Integer getSettlorType() {
        return settlorType;
    }

    public void setSettlorType(Integer settlorType) {
        this.settlorType = settlorType;
    }

    public BigDecimal getSettlePrice() {
        return settlePrice;
    }

    public void setSettlePrice(BigDecimal settlePrice) {
        this.settlePrice = settlePrice;
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

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Integer getOrderVersion() {
        return orderVersion;
    }

    public void setOrderVersion(Integer orderVersion) {
        this.orderVersion = orderVersion;
    }

    public String getSettlorId() {
        return settlorId;
    }

    public void setSettlorId(String settlorId) {
        this.settlorId = settlorId == null ? null : settlorId.trim();
    }

    public Date getSettleLaunchTime() {
        return settleLaunchTime;
    }

    public void setSettleLaunchTime(Date settleLaunchTime) {
        this.settleLaunchTime = settleLaunchTime;
    }

    public BigDecimal getCommissionPrice() {
        return commissionPrice;
    }

    public void setCommissionPrice(BigDecimal commissionPrice) {
        this.commissionPrice = commissionPrice;
    }

    public BigDecimal getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(BigDecimal contractPrice) {
        this.contractPrice = contractPrice;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public String getPrmtName() {
        return prmtName;
    }

    public void setPrmtName(String prmtName) {
        this.prmtName = prmtName == null ? null : prmtName.trim();
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public String getSpuCode() {
        return spuCode;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode == null ? null : spuCode.trim();
    }

    public String getSettlorCode() {
        return settlorCode;
    }

    public void setSettlorCode(String settlorCode) {
        this.settlorCode = settlorCode == null ? null : settlorCode.trim();
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}