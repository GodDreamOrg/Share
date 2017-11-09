package com.mk.share.order.api.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 购买商品VO
 *
 * @author wanghao
 * @create 2017-11-09 14:51
 */
public class BuySKUVO implements Serializable{
    private static final long serialVersionUID = 9103958150453430807L;

    /**
     * skuCode
     */
    private String skuCode;
    /**
     * spuCode
     */
    private String spuCode;
    /**
     * 目录code
     */
    private String catalogCode;
    /**
     * 商户代码
     */
    private String storeCode;
    /**
     * 商户名称
     */
    private String storeName;
    /**
     * 品牌代码
     */
    private String brandCode;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 商品名称
     */
    private String mdseName;
    /**
     * 现金单价
     */
    private BigDecimal cashPrice;
    /**
     * 实际价格
     */
    private BigDecimal realPrice;
    /**
     * 积分单价
     */
    private BigDecimal pointPrice;
    /**
     * 购买数量
     */
    private Integer quantity;

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSpuCode() {
        return spuCode;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getMdseName() {
        return mdseName;
    }

    public void setMdseName(String mdseName) {
        this.mdseName = mdseName;
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

    public BigDecimal getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(BigDecimal pointPrice) {
        this.pointPrice = pointPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
