package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_order", schema = "share_order", catalog = "")
public class OrderEntity {
    private Long id;
    private Long memberId;
    private String memberName;
    private String relatedMemberId;
    private String channelType;
    private Integer pointPrice;
    private Integer paymentStatus;
    private String mobile;
    private String clientEmail;
    private String failReason;
    private Integer status;
    private BigDecimal cashPrice;
    private Date paymentSuccTime;
    private String remark;
    private Integer paymentType;
    private BigDecimal paidCash;
    private Integer paidPoint;
    private String externalOrderCode;
    private String orderSource;
    private Integer distributionType;
    private String orderCode;
    private String orderHeadCode;
    private String storeCode;
    private String storeName;
    private Integer isAfterSales;
    private Long topActualId;
    private String orderBusinessType;
    private Integer orderTerminal;
    private String supplierCode;
    private String supplierName;
    private String combinedOrderCode;
    private Date deadlineTime;
    private BigDecimal freight;
    private Long createBy;
    private Date createTime;
    private Date updateTime;
    private Long updateBy;
    private Integer executionStatus;
    private String executionName;
    private String offlineStoreCode;
    private String offlineStoreName;
    private Integer executeStatus;

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
    @Column(name = "RELATED_MEMBER_ID", nullable = true, length = 64)
    public String getRelatedMemberId() {
        return relatedMemberId;
    }

    public void setRelatedMemberId(String relatedMemberId) {
        this.relatedMemberId = relatedMemberId;
    }

    @Basic
    @Column(name = "CHANNEL_TYPE", nullable = true, length = 20)
    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
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
    @Column(name = "PAYMENT_STATUS", nullable = true)
    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Basic
    @Column(name = "MOBILE", nullable = true, length = 20)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "CLIENT_EMAIL", nullable = true, length = 300)
    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    @Basic
    @Column(name = "FAIL_REASON", nullable = true, length = 1024)
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, precision = 0)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    @Column(name = "PAYMENT_SUCC_TIME", nullable = true)
    public Date getPaymentSuccTime() {
        return paymentSuccTime;
    }

    public void setPaymentSuccTime(Date paymentSuccTime) {
        this.paymentSuccTime = paymentSuccTime;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, length = 1024)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
    @Column(name = "EXTERNAL_ORDER_CODE", nullable = true, length = 100)
    public String getExternalOrderCode() {
        return externalOrderCode;
    }

    public void setExternalOrderCode(String externalOrderCode) {
        this.externalOrderCode = externalOrderCode;
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
    @Column(name = "DISTRIBUTION_TYPE", nullable = true)
    public Integer getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(Integer distributionType) {
        this.distributionType = distributionType;
    }

    @Basic
    @Column(name = "ORDER_CODE", nullable = true, length = 64)
    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
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
    @Column(name = "STORE_CODE", nullable = true, length = 50)
    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    @Basic
    @Column(name = "STORE_NAME", nullable = true, length = 200)
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Basic
    @Column(name = "IS_AFTER_SALES", nullable = true)
    public Integer getIsAfterSales() {
        return isAfterSales;
    }

    public void setIsAfterSales(Integer isAfterSales) {
        this.isAfterSales = isAfterSales;
    }

    @Basic
    @Column(name = "TOP_ACTUAL_ID", nullable = true)
    public Long getTopActualId() {
        return topActualId;
    }

    public void setTopActualId(Long topActualId) {
        this.topActualId = topActualId;
    }

    @Basic
    @Column(name = "ORDER_BUSINESS_TYPE", nullable = true, length = 20)
    public String getOrderBusinessType() {
        return orderBusinessType;
    }

    public void setOrderBusinessType(String orderBusinessType) {
        this.orderBusinessType = orderBusinessType;
    }

    @Basic
    @Column(name = "ORDER_TERMINAL", nullable = true)
    public Integer getOrderTerminal() {
        return orderTerminal;
    }

    public void setOrderTerminal(Integer orderTerminal) {
        this.orderTerminal = orderTerminal;
    }

    @Basic
    @Column(name = "SUPPLIER_CODE", nullable = true, length = 64)
    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    @Basic
    @Column(name = "SUPPLIER_NAME", nullable = true, length = 1024)
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Basic
    @Column(name = "COMBINED_ORDER_CODE", nullable = true, length = 64)
    public String getCombinedOrderCode() {
        return combinedOrderCode;
    }

    public void setCombinedOrderCode(String combinedOrderCode) {
        this.combinedOrderCode = combinedOrderCode;
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
    @Column(name = "FREIGHT", nullable = true, precision = 2)
    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
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
    @Column(name = "CREATE_TIME", nullable = true)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    @Column(name = "OFFLINE_STORE_CODE", nullable = true, length = 64)
    public String getOfflineStoreCode() {
        return offlineStoreCode;
    }

    public void setOfflineStoreCode(String offlineStoreCode) {
        this.offlineStoreCode = offlineStoreCode;
    }

    @Basic
    @Column(name = "OFFLINE_STORE_NAME", nullable = true, length = 256)
    public String getOfflineStoreName() {
        return offlineStoreName;
    }

    public void setOfflineStoreName(String offlineStoreName) {
        this.offlineStoreName = offlineStoreName;
    }

    @Basic
    @Column(name = "EXECUTE_STATUS", nullable = true)
    public Integer getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(Integer executeStatus) {
        this.executeStatus = executeStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != that.id) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (memberName != null ? !memberName.equals(that.memberName) : that.memberName != null) return false;
        if (relatedMemberId != null ? !relatedMemberId.equals(that.relatedMemberId) : that.relatedMemberId != null) return false;
        if (channelType != null ? !channelType.equals(that.channelType) : that.channelType != null) return false;
        if (pointPrice != null ? !pointPrice.equals(that.pointPrice) : that.pointPrice != null) return false;
        if (paymentStatus != null ? !paymentStatus.equals(that.paymentStatus) : that.paymentStatus != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (clientEmail != null ? !clientEmail.equals(that.clientEmail) : that.clientEmail != null) return false;
        if (failReason != null ? !failReason.equals(that.failReason) : that.failReason != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (cashPrice != null ? !cashPrice.equals(that.cashPrice) : that.cashPrice != null) return false;
        if (paymentSuccTime != null ? !paymentSuccTime.equals(that.paymentSuccTime) : that.paymentSuccTime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (paidCash != null ? !paidCash.equals(that.paidCash) : that.paidCash != null) return false;
        if (paidPoint != null ? !paidPoint.equals(that.paidPoint) : that.paidPoint != null) return false;
        if (externalOrderCode != null ? !externalOrderCode.equals(that.externalOrderCode) : that.externalOrderCode != null) return false;
        if (orderSource != null ? !orderSource.equals(that.orderSource) : that.orderSource != null) return false;
        if (distributionType != null ? !distributionType.equals(that.distributionType) : that.distributionType != null) return false;
        if (orderCode != null ? !orderCode.equals(that.orderCode) : that.orderCode != null) return false;
        if (orderHeadCode != null ? !orderHeadCode.equals(that.orderHeadCode) : that.orderHeadCode != null) return false;
        if (storeCode != null ? !storeCode.equals(that.storeCode) : that.storeCode != null) return false;
        if (storeName != null ? !storeName.equals(that.storeName) : that.storeName != null) return false;
        if (isAfterSales != null ? !isAfterSales.equals(that.isAfterSales) : that.isAfterSales != null) return false;
        if (topActualId != null ? !topActualId.equals(that.topActualId) : that.topActualId != null) return false;
        if (orderBusinessType != null ? !orderBusinessType.equals(that.orderBusinessType) : that.orderBusinessType != null) return false;
        if (orderTerminal != null ? !orderTerminal.equals(that.orderTerminal) : that.orderTerminal != null) return false;
        if (supplierCode != null ? !supplierCode.equals(that.supplierCode) : that.supplierCode != null) return false;
        if (supplierName != null ? !supplierName.equals(that.supplierName) : that.supplierName != null) return false;
        if (combinedOrderCode != null ? !combinedOrderCode.equals(that.combinedOrderCode) : that.combinedOrderCode != null) return false;
        if (deadlineTime != null ? !deadlineTime.equals(that.deadlineTime) : that.deadlineTime != null) return false;
        if (freight != null ? !freight.equals(that.freight) : that.freight != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (executionStatus != null ? !executionStatus.equals(that.executionStatus) : that.executionStatus != null) return false;
        if (executionName != null ? !executionName.equals(that.executionName) : that.executionName != null) return false;
        if (offlineStoreCode != null ? !offlineStoreCode.equals(that.offlineStoreCode) : that.offlineStoreCode != null) return false;
        if (offlineStoreName != null ? !offlineStoreName.equals(that.offlineStoreName) : that.offlineStoreName != null) return false;
        if (executeStatus != null ? !executeStatus.equals(that.executeStatus) : that.executeStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (memberName != null ? memberName.hashCode() : 0);
        result = 31 * result + (relatedMemberId != null ? relatedMemberId.hashCode() : 0);
        result = 31 * result + (channelType != null ? channelType.hashCode() : 0);
        result = 31 * result + (pointPrice != null ? pointPrice.hashCode() : 0);
        result = 31 * result + (paymentStatus != null ? paymentStatus.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (clientEmail != null ? clientEmail.hashCode() : 0);
        result = 31 * result + (failReason != null ? failReason.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (cashPrice != null ? cashPrice.hashCode() : 0);
        result = 31 * result + (paymentSuccTime != null ? paymentSuccTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (paidCash != null ? paidCash.hashCode() : 0);
        result = 31 * result + (paidPoint != null ? paidPoint.hashCode() : 0);
        result = 31 * result + (externalOrderCode != null ? externalOrderCode.hashCode() : 0);
        result = 31 * result + (orderSource != null ? orderSource.hashCode() : 0);
        result = 31 * result + (distributionType != null ? distributionType.hashCode() : 0);
        result = 31 * result + (orderCode != null ? orderCode.hashCode() : 0);
        result = 31 * result + (orderHeadCode != null ? orderHeadCode.hashCode() : 0);
        result = 31 * result + (storeCode != null ? storeCode.hashCode() : 0);
        result = 31 * result + (storeName != null ? storeName.hashCode() : 0);
        result = 31 * result + (isAfterSales != null ? isAfterSales.hashCode() : 0);
        result = 31 * result + (topActualId != null ? topActualId.hashCode() : 0);
        result = 31 * result + (orderBusinessType != null ? orderBusinessType.hashCode() : 0);
        result = 31 * result + (orderTerminal != null ? orderTerminal.hashCode() : 0);
        result = 31 * result + (supplierCode != null ? supplierCode.hashCode() : 0);
        result = 31 * result + (supplierName != null ? supplierName.hashCode() : 0);
        result = 31 * result + (combinedOrderCode != null ? combinedOrderCode.hashCode() : 0);
        result = 31 * result + (deadlineTime != null ? deadlineTime.hashCode() : 0);
        result = 31 * result + (freight != null ? freight.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (executionStatus != null ? executionStatus.hashCode() : 0);
        result = 31 * result + (executionName != null ? executionName.hashCode() : 0);
        result = 31 * result + (offlineStoreCode != null ? offlineStoreCode.hashCode() : 0);
        result = 31 * result + (offlineStoreName != null ? offlineStoreName.hashCode() : 0);
        result = 31 * result + (executeStatus != null ? executeStatus.hashCode() : 0);
        return result;
    }
}
