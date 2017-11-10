package com.mk.share.order.service.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItemEntity {
    private Long id;

    private String orderCode;

    private String orderHeadCode;

    private String orderItemCode;

    private String skuCode;

    private String spuCode;

    private String catelogCode;

    private String mdseName;

    private String brandCode;

    private String brandName;

    private BigDecimal cashPrice;

    private BigDecimal realPrice;

    private Integer pointPrice;

    private BigDecimal totalCashPrice;

    private BigDecimal totalRealPrice;

    private Integer totalPointPrice;

    private Integer quantity;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

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
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderHeadCode() {
        return orderHeadCode;
    }

    public void setOrderHeadCode(String orderHeadCode) {
        this.orderHeadCode = orderHeadCode == null ? null : orderHeadCode.trim();
    }

    public String getOrderItemCode() {
        return orderItemCode;
    }

    public void setOrderItemCode(String orderItemCode) {
        this.orderItemCode = orderItemCode == null ? null : orderItemCode.trim();
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public String getSpuCode() {
        return spuCode;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode == null ? null : spuCode.trim();
    }

    public String getCatelogCode() {
        return catelogCode;
    }

    public void setCatelogCode(String catelogCode) {
        this.catelogCode = catelogCode == null ? null : catelogCode.trim();
    }

    public String getMdseName() {
        return mdseName;
    }

    public void setMdseName(String mdseName) {
        this.mdseName = mdseName == null ? null : mdseName.trim();
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public BigDecimal getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(BigDecimal cashPrice) {
        this.cashPrice = cashPrice;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public Integer getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(Integer pointPrice) {
        this.pointPrice = pointPrice;
    }

    public BigDecimal getTotalCashPrice() {
        return totalCashPrice;
    }

    public void setTotalCashPrice(BigDecimal totalCashPrice) {
        this.totalCashPrice = totalCashPrice;
    }

    public BigDecimal getTotalRealPrice() {
        return totalRealPrice;
    }

    public void setTotalRealPrice(BigDecimal totalRealPrice) {
        this.totalRealPrice = totalRealPrice;
    }

    public Integer getTotalPointPrice() {
        return totalPointPrice;
    }

    public void setTotalPointPrice(Integer totalPointPrice) {
        this.totalPointPrice = totalPointPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}