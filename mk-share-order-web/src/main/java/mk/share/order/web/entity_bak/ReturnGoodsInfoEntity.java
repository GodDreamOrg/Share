package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_return_goods_info", schema = "share_order", catalog = "")
public class ReturnGoodsInfoEntity {
    private Long id;
    private Long returnGoodsItemId;
    private Integer refundType;
    private Integer refundPoint;
    private BigDecimal refundCash;
    private Integer refundStatus;
    private Long refundSerialNumber;
    private String couponCode;
    private String orderHeadCode;
    private Long updateBy;
    private Long createBy;
    private Date updateTime;
    private Date createTime;

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "REFUND_TYPE", nullable = true)
    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    @Basic
    @Column(name = "REFUND_POINT", nullable = true, precision = 0)
    public Integer getRefundPoint() {
        return refundPoint;
    }

    public void setRefundPoint(Integer refundPoint) {
        this.refundPoint = refundPoint;
    }

    @Basic
    @Column(name = "REFUND_CASH", nullable = true, precision = 2)
    public BigDecimal getRefundCash() {
        return refundCash;
    }

    public void setRefundCash(BigDecimal refundCash) {
        this.refundCash = refundCash;
    }

    @Basic
    @Column(name = "REFUND_STATUS", nullable = true)
    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    @Basic
    @Column(name = "REFUND_SERIAL_NUMBER", nullable = true)
    public Long getRefundSerialNumber() {
        return refundSerialNumber;
    }

    public void setRefundSerialNumber(Long refundSerialNumber) {
        this.refundSerialNumber = refundSerialNumber;
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
    @Column(name = "ORDER_HEAD_CODE", nullable = true, length = 64)
    public String getOrderHeadCode() {
        return orderHeadCode;
    }

    public void setOrderHeadCode(String orderHeadCode) {
        this.orderHeadCode = orderHeadCode;
    }

    @Basic
    @Column(name = "UPDATE_BY", nullable = true)
    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "CREATE_BY", nullable = true)
    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "UPDATE_TIME", nullable = true)
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = true)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReturnGoodsInfoEntity that = (ReturnGoodsInfoEntity) o;

        if (id != that.id) return false;
        if (returnGoodsItemId != null ? !returnGoodsItemId.equals(that.returnGoodsItemId) : that.returnGoodsItemId != null) return false;
        if (refundType != null ? !refundType.equals(that.refundType) : that.refundType != null) return false;
        if (refundPoint != null ? !refundPoint.equals(that.refundPoint) : that.refundPoint != null) return false;
        if (refundCash != null ? !refundCash.equals(that.refundCash) : that.refundCash != null) return false;
        if (refundStatus != null ? !refundStatus.equals(that.refundStatus) : that.refundStatus != null) return false;
        if (refundSerialNumber != null ? !refundSerialNumber.equals(that.refundSerialNumber) : that.refundSerialNumber != null) return false;
        if (couponCode != null ? !couponCode.equals(that.couponCode) : that.couponCode != null) return false;
        if (orderHeadCode != null ? !orderHeadCode.equals(that.orderHeadCode) : that.orderHeadCode != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (returnGoodsItemId != null ? returnGoodsItemId.hashCode() : 0);
        result = 31 * result + (refundType != null ? refundType.hashCode() : 0);
        result = 31 * result + (refundPoint != null ? refundPoint.hashCode() : 0);
        result = 31 * result + (refundCash != null ? refundCash.hashCode() : 0);
        result = 31 * result + (refundStatus != null ? refundStatus.hashCode() : 0);
        result = 31 * result + (refundSerialNumber != null ? refundSerialNumber.hashCode() : 0);
        result = 31 * result + (couponCode != null ? couponCode.hashCode() : 0);
        result = 31 * result + (orderHeadCode != null ? orderHeadCode.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
