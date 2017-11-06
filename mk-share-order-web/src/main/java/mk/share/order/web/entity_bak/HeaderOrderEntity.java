package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_header_order", schema = "share_order", catalog = "")
public class HeaderOrderEntity {
    private Long id;
    private Long memberId;
    private String memberName;
    private BigDecimal cashPrice;
    private Integer pointPrice;
    private Integer status;
    private Date paymentSuccTime;
    private Integer paymentType;
    private BigDecimal paidCash;
    private Integer paidPoint;
    private String orderSource;
    private String orderHeadCode;
    private BigDecimal reduceAmount;
    private Integer reducePoint;
    private String promotionCode;
    private Date deadlineTime;
    private Date createTime;
    private Long createBy;
    private Date updateTime;
    private Long updateBy;
    private Integer isDeductInventory;
    private Integer executionStatus;
    private String executionName;
    private Integer settleStatus;

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MEMBER_ID", nullable = true)
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "MEMBER_NAME", nullable = true, length = 128)
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Basic
    @Column(name = "CASH_PRICE", nullable = true, precision = 2)
    public BigDecimal getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(BigDecimal cashPrice) {
        this.cashPrice = cashPrice;
    }

    @Basic
    @Column(name = "POINT_PRICE", nullable = true, precision = 0)
    public Integer getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(Integer pointPrice) {
        this.pointPrice = pointPrice;
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
    @Column(name = "PAYMENT_SUCC_TIME", nullable = true)
    public Date getPaymentSuccTime() {
        return paymentSuccTime;
    }

    public void setPaymentSuccTime(Date paymentSuccTime) {
        this.paymentSuccTime = paymentSuccTime;
    }

    @Basic
    @Column(name = "PAYMENT_TYPE", nullable = true)
    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    @Basic
    @Column(name = "PAID_CASH", nullable = true, precision = 2)
    public BigDecimal getPaidCash() {
        return paidCash;
    }

    public void setPaidCash(BigDecimal paidCash) {
        this.paidCash = paidCash;
    }

    @Basic
    @Column(name = "PAID_POINT", nullable = true, precision = 0)
    public Integer getPaidPoint() {
        return paidPoint;
    }

    public void setPaidPoint(Integer paidPoint) {
        this.paidPoint = paidPoint;
    }

    @Basic
    @Column(name = "ORDER_SOURCE", nullable = true, length = 20)
    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
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
    @Column(name = "REDUCE_AMOUNT", nullable = true, precision = 2)
    public BigDecimal getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(BigDecimal reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    @Basic
    @Column(name = "REDUCE_POINT", nullable = true, precision = 0)
    public Integer getReducePoint() {
        return reducePoint;
    }

    public void setReducePoint(Integer reducePoint) {
        this.reducePoint = reducePoint;
    }

    @Basic
    @Column(name = "PROMOTION_CODE", nullable = true, length = 64)
    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    @Basic
    @Column(name = "DEADLINE_TIME", nullable = true)
    public Date getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(Date deadlineTime) {
        this.deadlineTime = deadlineTime;
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
    @Column(name = "UPDATE_BY", nullable = true)
    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "IS_DEDUCT_INVENTORY", nullable = true)
    public Integer getIsDeductInventory() {
        return isDeductInventory;
    }

    public void setIsDeductInventory(Integer isDeductInventory) {
        this.isDeductInventory = isDeductInventory;
    }

    @Basic
    @Column(name = "EXECUTION_STATUS", nullable = true)
    public Integer getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(Integer executionStatus) {
        this.executionStatus = executionStatus;
    }

    @Basic
    @Column(name = "EXECUTION_NAME", nullable = true, length = 128)
    public String getExecutionName() {
        return executionName;
    }

    public void setExecutionName(String executionName) {
        this.executionName = executionName;
    }

    @Basic
    @Column(name = "SETTLE_STATUS", nullable = true)
    public Integer getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Integer settleStatus) {
        this.settleStatus = settleStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeaderOrderEntity that = (HeaderOrderEntity) o;

        if (id != that.id) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (memberName != null ? !memberName.equals(that.memberName) : that.memberName != null) return false;
        if (cashPrice != null ? !cashPrice.equals(that.cashPrice) : that.cashPrice != null) return false;
        if (pointPrice != null ? !pointPrice.equals(that.pointPrice) : that.pointPrice != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (paymentSuccTime != null ? !paymentSuccTime.equals(that.paymentSuccTime) : that.paymentSuccTime != null) return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (paidCash != null ? !paidCash.equals(that.paidCash) : that.paidCash != null) return false;
        if (paidPoint != null ? !paidPoint.equals(that.paidPoint) : that.paidPoint != null) return false;
        if (orderSource != null ? !orderSource.equals(that.orderSource) : that.orderSource != null) return false;
        if (orderHeadCode != null ? !orderHeadCode.equals(that.orderHeadCode) : that.orderHeadCode != null) return false;
        if (reduceAmount != null ? !reduceAmount.equals(that.reduceAmount) : that.reduceAmount != null) return false;
        if (reducePoint != null ? !reducePoint.equals(that.reducePoint) : that.reducePoint != null) return false;
        if (promotionCode != null ? !promotionCode.equals(that.promotionCode) : that.promotionCode != null) return false;
        if (deadlineTime != null ? !deadlineTime.equals(that.deadlineTime) : that.deadlineTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (isDeductInventory != null ? !isDeductInventory.equals(that.isDeductInventory) : that.isDeductInventory != null) return false;
        if (executionStatus != null ? !executionStatus.equals(that.executionStatus) : that.executionStatus != null) return false;
        if (executionName != null ? !executionName.equals(that.executionName) : that.executionName != null) return false;
        if (settleStatus != null ? !settleStatus.equals(that.settleStatus) : that.settleStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (memberName != null ? memberName.hashCode() : 0);
        result = 31 * result + (cashPrice != null ? cashPrice.hashCode() : 0);
        result = 31 * result + (pointPrice != null ? pointPrice.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (paymentSuccTime != null ? paymentSuccTime.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (paidCash != null ? paidCash.hashCode() : 0);
        result = 31 * result + (paidPoint != null ? paidPoint.hashCode() : 0);
        result = 31 * result + (orderSource != null ? orderSource.hashCode() : 0);
        result = 31 * result + (orderHeadCode != null ? orderHeadCode.hashCode() : 0);
        result = 31 * result + (reduceAmount != null ? reduceAmount.hashCode() : 0);
        result = 31 * result + (reducePoint != null ? reducePoint.hashCode() : 0);
        result = 31 * result + (promotionCode != null ? promotionCode.hashCode() : 0);
        result = 31 * result + (deadlineTime != null ? deadlineTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (isDeductInventory != null ? isDeductInventory.hashCode() : 0);
        result = 31 * result + (executionStatus != null ? executionStatus.hashCode() : 0);
        result = 31 * result + (executionName != null ? executionName.hashCode() : 0);
        result = 31 * result + (settleStatus != null ? settleStatus.hashCode() : 0);
        return result;
    }
}
