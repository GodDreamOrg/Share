package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_return_goods", schema = "share_order", catalog = "")
public class ReturnGoodsEntity {
    private Long id;
    private String returnGoodsCode;
    private String orderCode;
    private String returnReason;
    private String orderBusinessType;
    private String channelType;
    private Long memberId;
    private String memberName;
    private String supplierCode;
    private String supplierName;
    private Date createDate;
    private String remark;
    private String mobile;
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
    @Column(name = "RETURN_GOODS_CODE", nullable = true, length = 64)
    public String getReturnGoodsCode() {
        return returnGoodsCode;
    }

    public void setReturnGoodsCode(String returnGoodsCode) {
        this.returnGoodsCode = returnGoodsCode;
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
    @Column(name = "RETURN_REASON", nullable = true, length = 1024)
    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
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
    @Column(name = "CHANNEL_TYPE", nullable = true, length = 20)
    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
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
    @Column(name = "SUPPLIER_CODE", nullable = true, length = 50)
    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    @Basic
    @Column(name = "SUPPLIER_NAME", nullable = true, length = 200)
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
    @Column(name = "MOBILE", nullable = true, length = 20)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

        ReturnGoodsEntity that = (ReturnGoodsEntity) o;

        if (id != that.id) return false;
        if (returnGoodsCode != null ? !returnGoodsCode.equals(that.returnGoodsCode) : that.returnGoodsCode != null) return false;
        if (orderCode != null ? !orderCode.equals(that.orderCode) : that.orderCode != null) return false;
        if (returnReason != null ? !returnReason.equals(that.returnReason) : that.returnReason != null) return false;
        if (orderBusinessType != null ? !orderBusinessType.equals(that.orderBusinessType) : that.orderBusinessType != null) return false;
        if (channelType != null ? !channelType.equals(that.channelType) : that.channelType != null) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (memberName != null ? !memberName.equals(that.memberName) : that.memberName != null) return false;
        if (supplierCode != null ? !supplierCode.equals(that.supplierCode) : that.supplierCode != null) return false;
        if (supplierName != null ? !supplierName.equals(that.supplierName) : that.supplierName != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (returnGoodsCode != null ? returnGoodsCode.hashCode() : 0);
        result = 31 * result + (orderCode != null ? orderCode.hashCode() : 0);
        result = 31 * result + (returnReason != null ? returnReason.hashCode() : 0);
        result = 31 * result + (orderBusinessType != null ? orderBusinessType.hashCode() : 0);
        result = 31 * result + (channelType != null ? channelType.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (memberName != null ? memberName.hashCode() : 0);
        result = 31 * result + (supplierCode != null ? supplierCode.hashCode() : 0);
        result = 31 * result + (supplierName != null ? supplierName.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        return result;
    }
}
