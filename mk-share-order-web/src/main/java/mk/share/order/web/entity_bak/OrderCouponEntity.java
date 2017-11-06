package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_order_coupon", schema = "share_order", catalog = "")
public class OrderCouponEntity {
    private Long id;
    private String orderCode;
    private String orderItemCode;
    private String skuCode;
    private String couponCode;
    private Integer couponStatus;
    private String serviceCode;
    private String serviceName;
    private Date startValidTime;
    private Date endValidTime;
    private Integer source;
    private Integer couponType;
    private Integer settleStatus;
    private Date createTime;
    private Long createBy;
    private Date updateTime;
    private Long updateBy;

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "ORDER_ITEM_CODE", nullable = true, length = 64)
    public String getOrderItemCode() {
        return orderItemCode;
    }

    public void setOrderItemCode(String orderItemCode) {
        this.orderItemCode = orderItemCode;
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
    @Column(name = "COUPON_CODE", nullable = true, length = 20)
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    @Basic
    @Column(name = "COUPON_STATUS", nullable = true)
    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    @Basic
    @Column(name = "SERVICE_CODE", nullable = true, length = 64)
    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Basic
    @Column(name = "SERVICE_NAME", nullable = true, length = 300)
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Basic
    @Column(name = "START_VALID_TIME", nullable = true)
    public Date getStartValidTime() {
        return startValidTime;
    }

    public void setStartValidTime(Date startValidTime) {
        this.startValidTime = startValidTime;
    }

    @Basic
    @Column(name = "END_VALID_TIME", nullable = true)
    public Date getEndValidTime() {
        return endValidTime;
    }

    public void setEndValidTime(Date endValidTime) {
        this.endValidTime = endValidTime;
    }

    @Basic
    @Column(name = "SOURCE", nullable = true)
    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    @Basic
    @Column(name = "COUPON_TYPE", nullable = true)
    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    @Basic
    @Column(name = "SETTLE_STATUS", nullable = true)
    public Integer getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Integer settleStatus) {
        this.settleStatus = settleStatus;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderCouponEntity that = (OrderCouponEntity) o;

        if (id != that.id) return false;
        if (orderCode != null ? !orderCode.equals(that.orderCode) : that.orderCode != null) return false;
        if (orderItemCode != null ? !orderItemCode.equals(that.orderItemCode) : that.orderItemCode != null) return false;
        if (skuCode != null ? !skuCode.equals(that.skuCode) : that.skuCode != null) return false;
        if (couponCode != null ? !couponCode.equals(that.couponCode) : that.couponCode != null) return false;
        if (couponStatus != null ? !couponStatus.equals(that.couponStatus) : that.couponStatus != null) return false;
        if (serviceCode != null ? !serviceCode.equals(that.serviceCode) : that.serviceCode != null) return false;
        if (serviceName != null ? !serviceName.equals(that.serviceName) : that.serviceName != null) return false;
        if (startValidTime != null ? !startValidTime.equals(that.startValidTime) : that.startValidTime != null) return false;
        if (endValidTime != null ? !endValidTime.equals(that.endValidTime) : that.endValidTime != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (couponType != null ? !couponType.equals(that.couponType) : that.couponType != null) return false;
        if (settleStatus != null ? !settleStatus.equals(that.settleStatus) : that.settleStatus != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (orderCode != null ? orderCode.hashCode() : 0);
        result = 31 * result + (orderItemCode != null ? orderItemCode.hashCode() : 0);
        result = 31 * result + (skuCode != null ? skuCode.hashCode() : 0);
        result = 31 * result + (couponCode != null ? couponCode.hashCode() : 0);
        result = 31 * result + (couponStatus != null ? couponStatus.hashCode() : 0);
        result = 31 * result + (serviceCode != null ? serviceCode.hashCode() : 0);
        result = 31 * result + (serviceName != null ? serviceName.hashCode() : 0);
        result = 31 * result + (startValidTime != null ? startValidTime.hashCode() : 0);
        result = 31 * result + (endValidTime != null ? endValidTime.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (couponType != null ? couponType.hashCode() : 0);
        result = 31 * result + (settleStatus != null ? settleStatus.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        return result;
    }
}
