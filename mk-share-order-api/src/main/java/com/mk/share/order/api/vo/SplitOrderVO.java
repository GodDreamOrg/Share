package com.mk.share.order.api.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 拆单VO
 *
 * @author wanghao
 * @create 2017-11-09 14:46
 */
public class SplitOrderVO implements Serializable{
    private static final long serialVersionUID = -6599947402425636150L;
    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
    /**
     * 实付总价
     */
    private BigDecimal totalRealPrice;
    /**
     * 总积分价格
     */
    private BigDecimal totalPoint;
    /**
     * 购买总数
     */
    private Integer quantity;
    /**
     * 会员ID
     */
    private Long memberId;
    /**
     * 会员名称
     */
    private String memberName;
    /**
     * 收货地址
     */
    private ReceivingAddressVO receivingAddressVO;
    /**
     * 支付类型
     */
    private Integer paymentType;
    /**
     * 购买的商品
     */
    private List<BuySKUVO> skuList;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalRealPrice() {
        return totalRealPrice;
    }

    public void setTotalRealPrice(BigDecimal totalRealPrice) {
        this.totalRealPrice = totalRealPrice;
    }

    public BigDecimal getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(BigDecimal totalPoint) {
        this.totalPoint = totalPoint;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        this.memberName = memberName;
    }

    public ReceivingAddressVO getReceivingAddressVO() {
        return receivingAddressVO;
    }

    public void setReceivingAddressVO(ReceivingAddressVO receivingAddressVO) {
        this.receivingAddressVO = receivingAddressVO;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public List<BuySKUVO> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<BuySKUVO> skuList) {
        this.skuList = skuList;
    }
}
