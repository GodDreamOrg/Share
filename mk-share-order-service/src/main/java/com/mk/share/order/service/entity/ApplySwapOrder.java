package com.mk.share.order.service.entity;

import java.util.Date;

public class ApplySwapOrder {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Long getApplyBy() {
        return applyBy;
    }

    public void setApplyBy(Long applyBy) {
        this.applyBy = applyBy;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public Long getProcessBy() {
        return processBy;
    }

    public void setProcessBy(Long processBy) {
        this.processBy = processBy;
    }

    public String getProcessApplyComment() {
        return processApplyComment;
    }

    public void setProcessApplyComment(String processApplyComment) {
        this.processApplyComment = processApplyComment == null ? null : processApplyComment.trim();
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(Integer operStatus) {
        this.operStatus = operStatus;
    }
}