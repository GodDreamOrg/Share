package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_apply_swap_order", schema = "share_order", catalog = "")
public class ApplySwapOrderEntity {
    private Long id;
    private String orderCode;
    private Long applyBy;
    private String skuCode;
    private Integer quantity;
    private String applyReason;
    private Date applyTime;
    private Date processTime;
    private Long processBy;
    private String processApplyComment;
    private Integer auditStatus;
    private Integer operStatus;

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
    @Column(name = "APPLY_BY", nullable = true)
    public Long getApplyBy() {
        return applyBy;
    }

    public void setApplyBy(Long applyBy) {
        this.applyBy = applyBy;
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

    @Basic
    @Column(name = "APPLY_REASON", nullable = true, length = 1024)
    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    @Basic
    @Column(name = "APPLY_TIME", nullable = true)
    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
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
    @Column(name = "PROCESS_BY", nullable = true)
    public Long getProcessBy() {
        return processBy;
    }

    public void setProcessBy(Long processBy) {
        this.processBy = processBy;
    }

    @Basic
    @Column(name = "PROCESS_APPLY_COMMENT", nullable = true, length = 1024)
    public String getProcessApplyComment() {
        return processApplyComment;
    }

    public void setProcessApplyComment(String processApplyComment) {
        this.processApplyComment = processApplyComment;
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
    @Column(name = "OPER_STATUS", nullable = true)
    public Integer getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(Integer operStatus) {
        this.operStatus = operStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApplySwapOrderEntity that = (ApplySwapOrderEntity) o;

        if (id != that.id) return false;
        if (orderCode != null ? !orderCode.equals(that.orderCode) : that.orderCode != null) return false;
        if (applyBy != null ? !applyBy.equals(that.applyBy) : that.applyBy != null) return false;
        if (skuCode != null ? !skuCode.equals(that.skuCode) : that.skuCode != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (applyReason != null ? !applyReason.equals(that.applyReason) : that.applyReason != null) return false;
        if (applyTime != null ? !applyTime.equals(that.applyTime) : that.applyTime != null) return false;
        if (processTime != null ? !processTime.equals(that.processTime) : that.processTime != null) return false;
        if (processBy != null ? !processBy.equals(that.processBy) : that.processBy != null) return false;
        if (processApplyComment != null ? !processApplyComment.equals(that.processApplyComment) : that.processApplyComment != null) return false;
        if (auditStatus != null ? !auditStatus.equals(that.auditStatus) : that.auditStatus != null) return false;
        if (operStatus != null ? !operStatus.equals(that.operStatus) : that.operStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (orderCode != null ? orderCode.hashCode() : 0);
        result = 31 * result + (applyBy != null ? applyBy.hashCode() : 0);
        result = 31 * result + (skuCode != null ? skuCode.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (applyReason != null ? applyReason.hashCode() : 0);
        result = 31 * result + (applyTime != null ? applyTime.hashCode() : 0);
        result = 31 * result + (processTime != null ? processTime.hashCode() : 0);
        result = 31 * result + (processBy != null ? processBy.hashCode() : 0);
        result = 31 * result + (processApplyComment != null ? processApplyComment.hashCode() : 0);
        result = 31 * result + (auditStatus != null ? auditStatus.hashCode() : 0);
        result = 31 * result + (operStatus != null ? operStatus.hashCode() : 0);
        return result;
    }
}
