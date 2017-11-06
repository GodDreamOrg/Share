package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_order_payment", schema = "share_order", catalog = "")
public class OrderPaymentEntity {
    private Long id;
    private String orderHeadCode;
    private String paymentNo;
    private String cxCardNo;
    private BigDecimal payAmount;
    private Date paymentTime;
    private Integer payChannel;
    private Date createTime;
    private String couponCode;
    private Integer payType;
    private int pushClearingFlag;
    private int reverseFlag;
    private int isDisable;
    private int payStatus;

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORDER_HEAD_CODE", nullable = true, length = 64)
    public String getOrderHeadCode() {
        return orderHeadCode;
    }

    public void setOrderHeadCode(String orderHeadCode) {
        this.orderHeadCode = orderHeadCode;
    }

    @Basic
    @Column(name = "PAYMENT_NO", nullable = true, length = 64)
    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    @Basic
    @Column(name = "CX_CARD_NO", nullable = true, length = 64)
    public String getCxCardNo() {
        return cxCardNo;
    }

    public void setCxCardNo(String cxCardNo) {
        this.cxCardNo = cxCardNo;
    }

    @Basic
    @Column(name = "PAY_AMOUNT", nullable = true, precision = 2)
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "PAYMENT_TIME", nullable = true)
    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Basic
    @Column(name = "PAY_CHANNEL", nullable = true)
    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = true)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    @Column(name = "PAY_TYPE", nullable = true)
    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "PUSH_CLEARING_FLAG", nullable = false)
    public int getPushClearingFlag() {
        return pushClearingFlag;
    }

    public void setPushClearingFlag(int pushClearingFlag) {
        this.pushClearingFlag = pushClearingFlag;
    }

    @Basic
    @Column(name = "REVERSE_FLAG", nullable = false)
    public int getReverseFlag() {
        return reverseFlag;
    }

    public void setReverseFlag(int reverseFlag) {
        this.reverseFlag = reverseFlag;
    }

    @Basic
    @Column(name = "IS_DISABLE", nullable = false)
    public int getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(int isDisable) {
        this.isDisable = isDisable;
    }

    @Basic
    @Column(name = "PAY_STATUS", nullable = false)
    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPaymentEntity that = (OrderPaymentEntity) o;

        if (id != that.id) return false;
        if (pushClearingFlag != that.pushClearingFlag) return false;
        if (reverseFlag != that.reverseFlag) return false;
        if (isDisable != that.isDisable) return false;
        if (payStatus != that.payStatus) return false;
        if (orderHeadCode != null ? !orderHeadCode.equals(that.orderHeadCode) : that.orderHeadCode != null) return false;
        if (paymentNo != null ? !paymentNo.equals(that.paymentNo) : that.paymentNo != null) return false;
        if (cxCardNo != null ? !cxCardNo.equals(that.cxCardNo) : that.cxCardNo != null) return false;
        if (payAmount != null ? !payAmount.equals(that.payAmount) : that.payAmount != null) return false;
        if (paymentTime != null ? !paymentTime.equals(that.paymentTime) : that.paymentTime != null) return false;
        if (payChannel != null ? !payChannel.equals(that.payChannel) : that.payChannel != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (couponCode != null ? !couponCode.equals(that.couponCode) : that.couponCode != null) return false;
        if (payType != null ? !payType.equals(that.payType) : that.payType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (orderHeadCode != null ? orderHeadCode.hashCode() : 0);
        result = 31 * result + (paymentNo != null ? paymentNo.hashCode() : 0);
        result = 31 * result + (cxCardNo != null ? cxCardNo.hashCode() : 0);
        result = 31 * result + (payAmount != null ? payAmount.hashCode() : 0);
        result = 31 * result + (paymentTime != null ? paymentTime.hashCode() : 0);
        result = 31 * result + (payChannel != null ? payChannel.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (couponCode != null ? couponCode.hashCode() : 0);
        result = 31 * result + (payType != null ? payType.hashCode() : 0);
        result = 31 * result + pushClearingFlag;
        result = 31 * result + reverseFlag;
        result = 31 * result + isDisable;
        result = 31 * result + payStatus;
        return result;
    }
}
