package com.mk.share.order.service.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RewardInfo {
    private Long id;

    private Integer rewardOrderType;

    private Integer rewardType;

    private String businessCode;

    private BigDecimal rewardAmount;

    private String rewardCode;

    private String rewardName;

    private Integer rewardStatus;

    private Date confirmedTime;

    private Date createTime;

    private Date updateTime;

    private Integer rewardDirection;

    private String channelNo;

    private String channelSource;

    private String transactionNo;

    private Long memberId;

    private String batchId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRewardOrderType() {
        return rewardOrderType;
    }

    public void setRewardOrderType(Integer rewardOrderType) {
        this.rewardOrderType = rewardOrderType;
    }

    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public BigDecimal getRewardAmount() {
        return rewardAmount;
    }

    public void setRewardAmount(BigDecimal rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public String getRewardCode() {
        return rewardCode;
    }

    public void setRewardCode(String rewardCode) {
        this.rewardCode = rewardCode == null ? null : rewardCode.trim();
    }

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName == null ? null : rewardName.trim();
    }

    public Integer getRewardStatus() {
        return rewardStatus;
    }

    public void setRewardStatus(Integer rewardStatus) {
        this.rewardStatus = rewardStatus;
    }

    public Date getConfirmedTime() {
        return confirmedTime;
    }

    public void setConfirmedTime(Date confirmedTime) {
        this.confirmedTime = confirmedTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRewardDirection() {
        return rewardDirection;
    }

    public void setRewardDirection(Integer rewardDirection) {
        this.rewardDirection = rewardDirection;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo == null ? null : channelNo.trim();
    }

    public String getChannelSource() {
        return channelSource;
    }

    public void setChannelSource(String channelSource) {
        this.channelSource = channelSource == null ? null : channelSource.trim();
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo == null ? null : transactionNo.trim();
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }
}