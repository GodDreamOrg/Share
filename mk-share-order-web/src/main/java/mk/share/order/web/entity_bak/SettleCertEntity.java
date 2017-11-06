package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_settle_cert", schema = "share_order", catalog = "")
public class SettleCertEntity {
    private Long id;
    private String batchId;
    private Long orderId;
    private String relateOrderId;
    private Integer status;
    private String orderItemId;
    private String mdseName;
    private String settlorName;
    private Integer settlorType;
    private BigDecimal settlePrice;
    private BigDecimal cashPrice;
    private Integer pointPrice;
    private Integer orderStatus;
    private String memberName;
    private Long memberId;
    private String custEmail;
    private String mobileNo;
    private Date settleTime;
    private Integer orderType;
    private String createUserId;
    private Integer orderVersion;
    private String settlorId;
    private Date settleLaunchTime;
    private BigDecimal commissionPrice;
    private BigDecimal contractPrice;
    private String msg;
    private Date processTime;
    private String prmtName;
    private Integer bizType;
    private String spuCode;
    private String settlorCode;
    private String orderCode;
    private String skuCode;
    private Integer quantity;

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
    @Column(name = "STATUS", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ORDER_ITEM_ID", nullable = true, length = 100)
    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    @Basic
    @Column(name = "MDSE_NAME", nullable = true, length = 1024)
    public String getMdseName() {
        return mdseName;
    }

    public void setMdseName(String mdseName) {
        this.mdseName = mdseName;
    }

    @Basic
    @Column(name = "SETTLOR_NAME", nullable = true, length = 125)
    public String getSettlorName() {
        return settlorName;
    }

    public void setSettlorName(String settlorName) {
        this.settlorName = settlorName;
    }

    @Basic
    @Column(name = "SETTLOR_TYPE", nullable = true)
    public Integer getSettlorType() {
        return settlorType;
    }

    public void setSettlorType(Integer settlorType) {
        this.settlorType = settlorType;
    }

    @Basic
    @Column(name = "SETTLE_PRICE", nullable = true, precision = 2)
    public BigDecimal getSettlePrice() {
        return settlePrice;
    }

    public void setSettlePrice(BigDecimal settlePrice) {
        this.settlePrice = settlePrice;
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
    @Column(name = "ORDER_STATUS", nullable = true)
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "MEMBER_NAME", nullable = true, length = 125)
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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
    @Column(name = "CUST_EMAIL", nullable = true, length = 125)
    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @Basic
    @Column(name = "MOBILE_NO", nullable = true, length = 20)
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Basic
    @Column(name = "SETTLE_TIME", nullable = true)
    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
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
    @Column(name = "CREATE_USER_ID", nullable = true, length = 50)
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "ORDER_VERSION", nullable = true)
    public Integer getOrderVersion() {
        return orderVersion;
    }

    public void setOrderVersion(Integer orderVersion) {
        this.orderVersion = orderVersion;
    }

    @Basic
    @Column(name = "SETTLOR_ID", nullable = true, length = 50)
    public String getSettlorId() {
        return settlorId;
    }

    public void setSettlorId(String settlorId) {
        this.settlorId = settlorId;
    }

    @Basic
    @Column(name = "SETTLE_LAUNCH_TIME", nullable = true)
    public Date getSettleLaunchTime() {
        return settleLaunchTime;
    }

    public void setSettleLaunchTime(Date settleLaunchTime) {
        this.settleLaunchTime = settleLaunchTime;
    }

    @Basic
    @Column(name = "COMMISSION_PRICE", nullable = true, precision = 6)
    public BigDecimal getCommissionPrice() {
        return commissionPrice;
    }

    public void setCommissionPrice(BigDecimal commissionPrice) {
        this.commissionPrice = commissionPrice;
    }

    @Basic
    @Column(name = "CONTRACT_PRICE", nullable = true, precision = 6)
    public BigDecimal getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(BigDecimal contractPrice) {
        this.contractPrice = contractPrice;
    }

    @Basic
    @Column(name = "MSG", nullable = true, length = 1024)
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Basic
    @Column(name = "PROCESS_TIME", nullable = true)
    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    @Basic
    @Column(name = "PRMT_NAME", nullable = true, length = 512)
    public String getPrmtName() {
        return prmtName;
    }

    public void setPrmtName(String prmtName) {
        this.prmtName = prmtName;
    }

    @Basic
    @Column(name = "BIZ_TYPE", nullable = true)
    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
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
    @Column(name = "SETTLOR_CODE", nullable = true, length = 50)
    public String getSettlorCode() {
        return settlorCode;
    }

    public void setSettlorCode(String settlorCode) {
        this.settlorCode = settlorCode;
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
    @Column(name = "SKU_CODE", nullable = true, length = 64)
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    @Basic
    @Column(name = "QUANTITY", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SettleCertEntity that = (SettleCertEntity) o;

        if (id != that.id) return false;
        if (batchId != null ? !batchId.equals(that.batchId) : that.batchId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (relateOrderId != null ? !relateOrderId.equals(that.relateOrderId) : that.relateOrderId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (orderItemId != null ? !orderItemId.equals(that.orderItemId) : that.orderItemId != null) return false;
        if (mdseName != null ? !mdseName.equals(that.mdseName) : that.mdseName != null) return false;
        if (settlorName != null ? !settlorName.equals(that.settlorName) : that.settlorName != null) return false;
        if (settlorType != null ? !settlorType.equals(that.settlorType) : that.settlorType != null) return false;
        if (settlePrice != null ? !settlePrice.equals(that.settlePrice) : that.settlePrice != null) return false;
        if (cashPrice != null ? !cashPrice.equals(that.cashPrice) : that.cashPrice != null) return false;
        if (pointPrice != null ? !pointPrice.equals(that.pointPrice) : that.pointPrice != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (memberName != null ? !memberName.equals(that.memberName) : that.memberName != null) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (custEmail != null ? !custEmail.equals(that.custEmail) : that.custEmail != null) return false;
        if (mobileNo != null ? !mobileNo.equals(that.mobileNo) : that.mobileNo != null) return false;
        if (settleTime != null ? !settleTime.equals(that.settleTime) : that.settleTime != null) return false;
        if (orderType != null ? !orderType.equals(that.orderType) : that.orderType != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (orderVersion != null ? !orderVersion.equals(that.orderVersion) : that.orderVersion != null) return false;
        if (settlorId != null ? !settlorId.equals(that.settlorId) : that.settlorId != null) return false;
        if (settleLaunchTime != null ? !settleLaunchTime.equals(that.settleLaunchTime) : that.settleLaunchTime != null) return false;
        if (commissionPrice != null ? !commissionPrice.equals(that.commissionPrice) : that.commissionPrice != null) return false;
        if (contractPrice != null ? !contractPrice.equals(that.contractPrice) : that.contractPrice != null) return false;
        if (msg != null ? !msg.equals(that.msg) : that.msg != null) return false;
        if (processTime != null ? !processTime.equals(that.processTime) : that.processTime != null) return false;
        if (prmtName != null ? !prmtName.equals(that.prmtName) : that.prmtName != null) return false;
        if (bizType != null ? !bizType.equals(that.bizType) : that.bizType != null) return false;
        if (spuCode != null ? !spuCode.equals(that.spuCode) : that.spuCode != null) return false;
        if (settlorCode != null ? !settlorCode.equals(that.settlorCode) : that.settlorCode != null) return false;
        if (orderCode != null ? !orderCode.equals(that.orderCode) : that.orderCode != null) return false;
        if (skuCode != null ? !skuCode.equals(that.skuCode) : that.skuCode != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (batchId != null ? batchId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (relateOrderId != null ? relateOrderId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (orderItemId != null ? orderItemId.hashCode() : 0);
        result = 31 * result + (mdseName != null ? mdseName.hashCode() : 0);
        result = 31 * result + (settlorName != null ? settlorName.hashCode() : 0);
        result = 31 * result + (settlorType != null ? settlorType.hashCode() : 0);
        result = 31 * result + (settlePrice != null ? settlePrice.hashCode() : 0);
        result = 31 * result + (cashPrice != null ? cashPrice.hashCode() : 0);
        result = 31 * result + (pointPrice != null ? pointPrice.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (memberName != null ? memberName.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (custEmail != null ? custEmail.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (settleTime != null ? settleTime.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (orderVersion != null ? orderVersion.hashCode() : 0);
        result = 31 * result + (settlorId != null ? settlorId.hashCode() : 0);
        result = 31 * result + (settleLaunchTime != null ? settleLaunchTime.hashCode() : 0);
        result = 31 * result + (commissionPrice != null ? commissionPrice.hashCode() : 0);
        result = 31 * result + (contractPrice != null ? contractPrice.hashCode() : 0);
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        result = 31 * result + (processTime != null ? processTime.hashCode() : 0);
        result = 31 * result + (prmtName != null ? prmtName.hashCode() : 0);
        result = 31 * result + (bizType != null ? bizType.hashCode() : 0);
        result = 31 * result + (spuCode != null ? spuCode.hashCode() : 0);
        result = 31 * result + (settlorCode != null ? settlorCode.hashCode() : 0);
        result = 31 * result + (orderCode != null ? orderCode.hashCode() : 0);
        result = 31 * result + (skuCode != null ? skuCode.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }
}
