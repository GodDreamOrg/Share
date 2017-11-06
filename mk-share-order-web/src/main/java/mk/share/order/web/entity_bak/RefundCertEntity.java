package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_refund_cert", schema = "share_order", catalog = "")
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

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BATCH_ID", nullable = true, length = 50)
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    @Basic
    @Column(name = "CREATE_USERID", nullable = true, length = 50)
    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }

    @Basic
    @Column(name = "ORDER_ID", nullable = true)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "RELATE_ORDER_ID", nullable = true, length = 50)
    public String getRelateOrderId() {
        return relateOrderId;
    }

    public void setRelateOrderId(String relateOrderId) {
        this.relateOrderId = relateOrderId;
    }

    @Basic
    @Column(name = "ORDER_TYPE", nullable = true)
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "STATUS", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "MEMBER_ID", nullable = true, length = 50)
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "MEMBER_NAME", nullable = true, length = 200)
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Basic
    @Column(name = "CUST_EMAIL", nullable = true, length = 50)
    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @Basic
    @Column(name = "MOBILE_NO", nullable = true, length = 50)
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Basic
    @Column(name = "TRADE_EXPIRED", nullable = true)
    public Integer getTradeExpired() {
        return tradeExpired;
    }

    public void setTradeExpired(Integer tradeExpired) {
        this.tradeExpired = tradeExpired;
    }

    @Basic
    @Column(name = "BANK_NAME", nullable = true, length = 150)
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Basic
    @Column(name = "BANK_ACCOUNT", nullable = true, length = 50)
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Basic
    @Column(name = "PROVINCE_CODE", nullable = true, length = 20)
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Basic
    @Column(name = "CITY_CODE", nullable = true, length = 20)
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "MDSE_NAME", nullable = true, length = 200)
    public String getMdseName() {
        return mdseName;
    }

    public void setMdseName(String mdseName) {
        this.mdseName = mdseName;
    }

    @Basic
    @Column(name = "SUPPLIER_ID", nullable = true, length = 20)
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "SUPPLIER_TYPE", nullable = true, length = 20)
    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    @Basic
    @Column(name = "REFUND_POINT_AMOUNT", nullable = true, precision = 0)
    public Integer getRefundPointAmount() {
        return refundPointAmount;
    }

    public void setRefundPointAmount(Integer refundPointAmount) {
        this.refundPointAmount = refundPointAmount;
    }

    @Basic
    @Column(name = "REFUND_CASH_AMOUNT", nullable = true, precision = 2)
    public BigDecimal getRefundCashAmount() {
        return refundCashAmount;
    }

    public void setRefundCashAmount(BigDecimal refundCashAmount) {
        this.refundCashAmount = refundCashAmount;
    }

    @Basic
    @Column(name = "BANK_USER_NAME", nullable = true, length = 50)
    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName;
    }

    @Basic
    @Column(name = "ERROR_CODE", nullable = true, length = 50)
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Basic
    @Column(name = "ERROR_MSG", nullable = true, length = 500)
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Basic
    @Column(name = "ERROR_TIME", nullable = true)
    public Date getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Date errorTime) {
        this.errorTime = errorTime;
    }

    @Basic
    @Column(name = "REFUND_MSG", nullable = true, length = 500)
    public String getRefundMsg() {
        return refundMsg;
    }

    public void setRefundMsg(String refundMsg) {
        this.refundMsg = refundMsg;
    }

    @Basic
    @Column(name = "REFUND_PROCESS_TIME", nullable = true)
    public Date getRefundProcessTime() {
        return refundProcessTime;
    }

    public void setRefundProcessTime(Date refundProcessTime) {
        this.refundProcessTime = refundProcessTime;
    }

    @Basic
    @Column(name = "POINT_AMOUNT", nullable = true, precision = 0)
    public Integer getPointAmount() {
        return pointAmount;
    }

    public void setPointAmount(Integer pointAmount) {
        this.pointAmount = pointAmount;
    }

    @Basic
    @Column(name = "CASH_AMOUNT", nullable = true, precision = 2)
    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    @Basic
    @Column(name = "REFUND_LAUNCH_TIME", nullable = true)
    public Date getRefundLaunchTime() {
        return refundLaunchTime;
    }

    public void setRefundLaunchTime(Date refundLaunchTime) {
        this.refundLaunchTime = refundLaunchTime;
    }

    @Basic
    @Column(name = "SPU_CODE", nullable = true, length = 50)
    public String getSpuCode() {
        return spuCode;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode;
    }

    @Basic
    @Column(name = "RETURN_GOODS_ITEM_ID", nullable = true)
    public Long getReturnGoodsItemId() {
        return returnGoodsItemId;
    }

    public void setReturnGoodsItemId(Long returnGoodsItemId) {
        this.returnGoodsItemId = returnGoodsItemId;
    }

    @Basic
    @Column(name = "SOUCE_TYPE", nullable = true)
    public Integer getSouceType() {
        return souceType;
    }

    public void setSouceType(Integer souceType) {
        this.souceType = souceType;
    }

    @Basic
    @Column(name = "ORDER_CODE", nullable = true, length = 50)
    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    @Basic
    @Column(name = "SKU_CODE", nullable = true, length = 64)
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    @Basic
    @Column(name = "ORDER_ITEM_ID", nullable = true, length = 20)
    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    @Basic
    @Column(name = "COUPON_CODE", nullable = true, length = 20)
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    @Basic
    @Column(name = "PAYMENT_NO", nullable = true, length = 64)
    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefundCertEntity that = (RefundCertEntity) o;

        if (id != that.id) return false;
        if (batchId != null ? !batchId.equals(that.batchId) : that.batchId != null) return false;
        if (createUserid != null ? !createUserid.equals(that.createUserid) : that.createUserid != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (relateOrderId != null ? !relateOrderId.equals(that.relateOrderId) : that.relateOrderId != null) return false;
        if (orderType != null ? !orderType.equals(that.orderType) : that.orderType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (memberName != null ? !memberName.equals(that.memberName) : that.memberName != null) return false;
        if (custEmail != null ? !custEmail.equals(that.custEmail) : that.custEmail != null) return false;
        if (mobileNo != null ? !mobileNo.equals(that.mobileNo) : that.mobileNo != null) return false;
        if (tradeExpired != null ? !tradeExpired.equals(that.tradeExpired) : that.tradeExpired != null) return false;
        if (bankName != null ? !bankName.equals(that.bankName) : that.bankName != null) return false;
        if (bankAccount != null ? !bankAccount.equals(that.bankAccount) : that.bankAccount != null) return false;
        if (provinceCode != null ? !provinceCode.equals(that.provinceCode) : that.provinceCode != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (mdseName != null ? !mdseName.equals(that.mdseName) : that.mdseName != null) return false;
        if (supplierId != null ? !supplierId.equals(that.supplierId) : that.supplierId != null) return false;
        if (supplierType != null ? !supplierType.equals(that.supplierType) : that.supplierType != null) return false;
        if (refundPointAmount != null ? !refundPointAmount.equals(that.refundPointAmount) : that.refundPointAmount != null) return false;
        if (refundCashAmount != null ? !refundCashAmount.equals(that.refundCashAmount) : that.refundCashAmount != null) return false;
        if (bankUserName != null ? !bankUserName.equals(that.bankUserName) : that.bankUserName != null) return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        if (errorMsg != null ? !errorMsg.equals(that.errorMsg) : that.errorMsg != null) return false;
        if (errorTime != null ? !errorTime.equals(that.errorTime) : that.errorTime != null) return false;
        if (refundMsg != null ? !refundMsg.equals(that.refundMsg) : that.refundMsg != null) return false;
        if (refundProcessTime != null ? !refundProcessTime.equals(that.refundProcessTime) : that.refundProcessTime != null) return false;
        if (pointAmount != null ? !pointAmount.equals(that.pointAmount) : that.pointAmount != null) return false;
        if (cashAmount != null ? !cashAmount.equals(that.cashAmount) : that.cashAmount != null) return false;
        if (refundLaunchTime != null ? !refundLaunchTime.equals(that.refundLaunchTime) : that.refundLaunchTime != null) return false;
        if (spuCode != null ? !spuCode.equals(that.spuCode) : that.spuCode != null) return false;
        if (returnGoodsItemId != null ? !returnGoodsItemId.equals(that.returnGoodsItemId) : that.returnGoodsItemId != null) return false;
        if (souceType != null ? !souceType.equals(that.souceType) : that.souceType != null) return false;
        if (orderCode != null ? !orderCode.equals(that.orderCode) : that.orderCode != null) return false;
        if (skuCode != null ? !skuCode.equals(that.skuCode) : that.skuCode != null) return false;
        if (orderItemId != null ? !orderItemId.equals(that.orderItemId) : that.orderItemId != null) return false;
        if (couponCode != null ? !couponCode.equals(that.couponCode) : that.couponCode != null) return false;
        if (paymentNo != null ? !paymentNo.equals(that.paymentNo) : that.paymentNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (batchId != null ? batchId.hashCode() : 0);
        result = 31 * result + (createUserid != null ? createUserid.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (relateOrderId != null ? relateOrderId.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (memberName != null ? memberName.hashCode() : 0);
        result = 31 * result + (custEmail != null ? custEmail.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (tradeExpired != null ? tradeExpired.hashCode() : 0);
        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (provinceCode != null ? provinceCode.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (mdseName != null ? mdseName.hashCode() : 0);
        result = 31 * result + (supplierId != null ? supplierId.hashCode() : 0);
        result = 31 * result + (supplierType != null ? supplierType.hashCode() : 0);
        result = 31 * result + (refundPointAmount != null ? refundPointAmount.hashCode() : 0);
        result = 31 * result + (refundCashAmount != null ? refundCashAmount.hashCode() : 0);
        result = 31 * result + (bankUserName != null ? bankUserName.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (errorMsg != null ? errorMsg.hashCode() : 0);
        result = 31 * result + (errorTime != null ? errorTime.hashCode() : 0);
        result = 31 * result + (refundMsg != null ? refundMsg.hashCode() : 0);
        result = 31 * result + (refundProcessTime != null ? refundProcessTime.hashCode() : 0);
        result = 31 * result + (pointAmount != null ? pointAmount.hashCode() : 0);
        result = 31 * result + (cashAmount != null ? cashAmount.hashCode() : 0);
        result = 31 * result + (refundLaunchTime != null ? refundLaunchTime.hashCode() : 0);
        result = 31 * result + (spuCode != null ? spuCode.hashCode() : 0);
        result = 31 * result + (returnGoodsItemId != null ? returnGoodsItemId.hashCode() : 0);
        result = 31 * result + (souceType != null ? souceType.hashCode() : 0);
        result = 31 * result + (orderCode != null ? orderCode.hashCode() : 0);
        result = 31 * result + (skuCode != null ? skuCode.hashCode() : 0);
        result = 31 * result + (orderItemId != null ? orderItemId.hashCode() : 0);
        result = 31 * result + (couponCode != null ? couponCode.hashCode() : 0);
        result = 31 * result + (paymentNo != null ? paymentNo.hashCode() : 0);
        return result;
    }
}
