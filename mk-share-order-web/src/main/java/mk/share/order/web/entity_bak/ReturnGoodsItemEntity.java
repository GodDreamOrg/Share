package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_return_goods_item", schema = "share_order", catalog = "")
public class ReturnGoodsItemEntity {
    private Long id;
    private Long returnGoodsId;
    private String spuCode;
    private String skuCode;
    private String mdseName;
    private Integer quantity;
    private BigDecimal returnCash;
    private Integer returnPoint;
    private Integer auditStatus;
    private Integer productSource;
    private String orderItemCode;
    private BigDecimal cashPrice;
    private Integer pointPrice;
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
    @Column(name = "RETURN_GOODS_ID", nullable = true)
    public Long getReturnGoodsId() {
        return returnGoodsId;
    }

    public void setReturnGoodsId(Long returnGoodsId) {
        this.returnGoodsId = returnGoodsId;
    }

    @Basic
    @Column(name = "SPU_CODE", nullable = true, length = 64)
    public String getSpuCode() {
        return spuCode;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode;
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
    @Column(name = "MDSE_NAME", nullable = true, length = 1024)
    public String getMdseName() {
        return mdseName;
    }

    public void setMdseName(String mdseName) {
        this.mdseName = mdseName;
    }

    @Basic
    @Column(name = "QUANTITY", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "RETURN_CASH", nullable = true, precision = 2)
    public BigDecimal getReturnCash() {
        return returnCash;
    }

    public void setReturnCash(BigDecimal returnCash) {
        this.returnCash = returnCash;
    }

    @Basic
    @Column(name = "RETURN_POINT", nullable = true, precision = 0)
    public Integer getReturnPoint() {
        return returnPoint;
    }

    public void setReturnPoint(Integer returnPoint) {
        this.returnPoint = returnPoint;
    }

    @Basic
    @Column(name = "AUDIT_STATUS", nullable = true)
    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Basic
    @Column(name = "PRODUCT_SOURCE", nullable = true)
    public Integer getProductSource() {
        return productSource;
    }

    public void setProductSource(Integer productSource) {
        this.productSource = productSource;
    }

    @Basic
    @Column(name = "ORDER_ITEM_CODE", nullable = false, length = 64)
    public String getOrderItemCode() {
        return orderItemCode;
    }

    public void setOrderItemCode(String orderItemCode) {
        this.orderItemCode = orderItemCode;
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

        ReturnGoodsItemEntity that = (ReturnGoodsItemEntity) o;

        if (id != that.id) return false;
        if (returnGoodsId != null ? !returnGoodsId.equals(that.returnGoodsId) : that.returnGoodsId != null) return false;
        if (spuCode != null ? !spuCode.equals(that.spuCode) : that.spuCode != null) return false;
        if (skuCode != null ? !skuCode.equals(that.skuCode) : that.skuCode != null) return false;
        if (mdseName != null ? !mdseName.equals(that.mdseName) : that.mdseName != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (returnCash != null ? !returnCash.equals(that.returnCash) : that.returnCash != null) return false;
        if (returnPoint != null ? !returnPoint.equals(that.returnPoint) : that.returnPoint != null) return false;
        if (auditStatus != null ? !auditStatus.equals(that.auditStatus) : that.auditStatus != null) return false;
        if (productSource != null ? !productSource.equals(that.productSource) : that.productSource != null) return false;
        if (orderItemCode != null ? !orderItemCode.equals(that.orderItemCode) : that.orderItemCode != null) return false;
        if (cashPrice != null ? !cashPrice.equals(that.cashPrice) : that.cashPrice != null) return false;
        if (pointPrice != null ? !pointPrice.equals(that.pointPrice) : that.pointPrice != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (returnGoodsId != null ? returnGoodsId.hashCode() : 0);
        result = 31 * result + (spuCode != null ? spuCode.hashCode() : 0);
        result = 31 * result + (skuCode != null ? skuCode.hashCode() : 0);
        result = 31 * result + (mdseName != null ? mdseName.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (returnCash != null ? returnCash.hashCode() : 0);
        result = 31 * result + (returnPoint != null ? returnPoint.hashCode() : 0);
        result = 31 * result + (auditStatus != null ? auditStatus.hashCode() : 0);
        result = 31 * result + (productSource != null ? productSource.hashCode() : 0);
        result = 31 * result + (orderItemCode != null ? orderItemCode.hashCode() : 0);
        result = 31 * result + (cashPrice != null ? cashPrice.hashCode() : 0);
        result = 31 * result + (pointPrice != null ? pointPrice.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
