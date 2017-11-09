package com.mk.share.order.api.vo;

import java.io.Serializable;

/**
 * 收货地址VO
 *
 * @author wanghao
 * @create 2017-11-09 14:50
 */
public class ReceivingAddressVO implements Serializable {
    private static final long serialVersionUID = -8262889441834586885L;

    /**
     * 邮政编码
     */
    private String zipCode;
    /**
     * 省code
     */
    private String provinceCode;
    /**
     * 市code
     */
    private String cityCode;
    /**
     * 县code
     */
    private String countyCode;
    /**
     * 具体收货地址
     */
    private String specificAddress;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 收件人名称
     */
    private String consigneeName;
    /**
     * 移动电话
     */
    private String mobilePhoneNumber;
    /**
     * 固定电话
     */
    private String telephone;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getSpecificAddress() {
        return specificAddress;
    }

    public void setSpecificAddress(String specificAddress) {
        this.specificAddress = specificAddress;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
