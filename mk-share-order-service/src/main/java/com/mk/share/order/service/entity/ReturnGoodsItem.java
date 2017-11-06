package com.mk.share.order.service.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ReturnGoodsItem {
    private Long id;

    private Long returnGoodsId;

    private String spuCode;

    private String skuCode;

    private String mdseName;

    private Integer quantity;

    private BigDecimal returnCash;

    private Integer returnPoint;

    private Integer auditStatus;

    private Integer productSource;

    private String orderItemCode;

    private BigDecimal cashPrice;

    private Integer pointPrice;

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

    public Long getReturnGoodsId() {
        return returnGoodsId;
    }

    public void setReturnGoodsId(Long returnGoodsId) {
        this.returnGoodsId = returnGoodsId;
    }

    public String getSpuCode() {
        return spuCode;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode == null ? null : spuCode.trim();
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public String getMdseName() {
        return mdseName;
    }

    public void setMdseName(String mdseName) {
        this.mdseName = mdseName == null ? null : mdseName.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getReturnCash() {
        return returnCash;
    }

    public void setReturnCash(BigDecimal returnCash) {
        this.returnCash = returnCash;
    }

    public Integer getReturnPoint() {
        return returnPoint;
    }

    public void setReturnPoint(Integer returnPoint) {
        this.returnPoint = returnPoint;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getProductSource() {
        return productSource;
    }

    public void setProductSource(Integer productSource) {
        this.productSource = productSource;
    }

    public String getOrderItemCode() {
        return orderItemCode;
    }

    public void setOrderItemCode(String orderItemCode) {
        this.orderItemCode = orderItemCode == null ? null : orderItemCode.trim();
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