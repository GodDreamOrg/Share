package com.mk.share.order.service.entity;

import java.util.Date;

public class LogisticsInfo {
    private Long id;

    private String deliveryNo;

    private String email;

    private String provinceCode;

    private String cityCode;

    private String receiverMobile;

    private String receiverAddress;

    private String receiverName;

    private String logisticsCompanyName;

    private String logisticsCompanyCode;

    private Date distributionTime;

    private String provinceDescription;

    private String cityDescription;

    private String areaDescription;

    private Integer distributionMode;

    private String orderCode;

    private Integer distributionStatus;

    private String distributionRemark;

    private String areaCode;

    private String zipCode;

    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo == null ? null : deliveryNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getLogisticsCompanyName() {
        return logisticsCompanyName;
    }

    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName == null ? null : logisticsCompanyName.trim();
    }

    public String getLogisticsCompanyCode() {
        return logisticsCompanyCode;
    }

    public void setLogisticsCompanyCode(String logisticsCompanyCode) {
        this.logisticsCompanyCode = logisticsCompanyCode == null ? null : logisticsCompanyCode.trim();
    }

    public Date getDistributionTime() {
        return distributionTime;
    }

    public void setDistributionTime(Date distributionTime) {
        this.distributionTime = distributionTime;
    }

    public String getProvinceDescription() {
        return provinceDescription;
    }

    public void setProvinceDescription(String provinceDescription) {
        this.provinceDescription = provinceDescription == null ? null : provinceDescription.trim();
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription == null ? null : cityDescription.trim();
    }

    public String getAreaDescription() {
        return areaDescription;
    }

    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription == null ? null : areaDescription.trim();
    }

    public Integer getDistributionMode() {
        return distributionMode;
    }

    public void setDistributionMode(Integer distributionMode) {
        this.distributionMode = distributionMode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getDistributionStatus() {
        return distributionStatus;
    }

    public void setDistributionStatus(Integer distributionStatus) {
        this.distributionStatus = distributionStatus;
    }

    public String getDistributionRemark() {
        return distributionRemark;
    }

    public void setDistributionRemark(String distributionRemark) {
        this.distributionRemark = distributionRemark == null ? null : distributionRemark.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}