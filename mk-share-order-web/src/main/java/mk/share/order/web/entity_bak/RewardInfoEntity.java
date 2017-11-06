package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_reward_info", schema = "share_order", catalog = "")
public class RewardInfoEntity {
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

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "REWARD_ORDER_TYPE", nullable = true)
    public Integer getRewardOrderType() {
        return rewardOrderType;
    }

    public void setRewardOrderType(Integer rewardOrderType) {
        this.rewardOrderType = rewardOrderType;
    }

    @Basic
    @Column(name = "REWARD_TYPE", nullable = true)
    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    @Basic
    @Column(name = "BUSINESS_CODE", nullable = true, length = 50)
    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    @Basic
    @Column(name = "REWARD_AMOUNT", nullable = true, precision = 2)
    public BigDecimal getRewardAmount() {
        return rewardAmount;
    }

    public void setRewardAmount(BigDecimal rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    @Basic
    @Column(name = "REWARD_CODE", nullable = true, length = 50)
    public String getRewardCode() {
        return rewardCode;
    }

    public void setRewardCode(String rewardCode) {
        this.rewardCode = rewardCode;
    }

    @Basic
    @Column(name = "REWARD_NAME", nullable = true, length = 50)
    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }

    @Basic
    @Column(name = "REWARD_STATUS", nullable = true)
    public Integer getRewardStatus() {
        return rewardStatus;
    }

    public void setRewardStatus(Integer rewardStatus) {
        this.rewardStatus = rewardStatus;
    }

    @Basic
    @Column(name = "CONFIRMED_TIME", nullable = true)
    public Date getConfirmedTime() {
        return confirmedTime;
    }

    public void setConfirmedTime(Date confirmedTime) {
        this.confirmedTime = confirmedTime;
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
    @Column(name = "REWARD_DIRECTION", nullable = true)
    public Integer getRewardDirection() {
        return rewardDirection;
    }

    public void setRewardDirection(Integer rewardDirection) {
        this.rewardDirection = rewardDirection;
    }

    @Basic
    @Column(name = "CHANNEL_NO", nullable = true, length = 50)
    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    @Basic
    @Column(name = "CHANNEL_SOURCE", nullable = true, length = 50)
    public String getChannelSource() {
        return channelSource;
    }

    public void setChannelSource(String channelSource) {
        this.channelSource = channelSource;
    }

    @Basic
    @Column(name = "TRANSACTION_NO", nullable = true, length = 50)
    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
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
    @Column(name = "BATCH_ID", nullable = true, length = 50)
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RewardInfoEntity that = (RewardInfoEntity) o;

        if (id != that.id) return false;
        if (rewardOrderType != null ? !rewardOrderType.equals(that.rewardOrderType) : that.rewardOrderType != null) return false;
        if (rewardType != null ? !rewardType.equals(that.rewardType) : that.rewardType != null) return false;
        if (businessCode != null ? !businessCode.equals(that.businessCode) : that.businessCode != null) return false;
        if (rewardAmount != null ? !rewardAmount.equals(that.rewardAmount) : that.rewardAmount != null) return false;
        if (rewardCode != null ? !rewardCode.equals(that.rewardCode) : that.rewardCode != null) return false;
        if (rewardName != null ? !rewardName.equals(that.rewardName) : that.rewardName != null) return false;
        if (rewardStatus != null ? !rewardStatus.equals(that.rewardStatus) : that.rewardStatus != null) return false;
        if (confirmedTime != null ? !confirmedTime.equals(that.confirmedTime) : that.confirmedTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (rewardDirection != null ? !rewardDirection.equals(that.rewardDirection) : that.rewardDirection != null) return false;
        if (channelNo != null ? !channelNo.equals(that.channelNo) : that.channelNo != null) return false;
        if (channelSource != null ? !channelSource.equals(that.channelSource) : that.channelSource != null) return false;
        if (transactionNo != null ? !transactionNo.equals(that.transactionNo) : that.transactionNo != null) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (batchId != null ? !batchId.equals(that.batchId) : that.batchId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (rewardOrderType != null ? rewardOrderType.hashCode() : 0);
        result = 31 * result + (rewardType != null ? rewardType.hashCode() : 0);
        result = 31 * result + (businessCode != null ? businessCode.hashCode() : 0);
        result = 31 * result + (rewardAmount != null ? rewardAmount.hashCode() : 0);
        result = 31 * result + (rewardCode != null ? rewardCode.hashCode() : 0);
        result = 31 * result + (rewardName != null ? rewardName.hashCode() : 0);
        result = 31 * result + (rewardStatus != null ? rewardStatus.hashCode() : 0);
        result = 31 * result + (confirmedTime != null ? confirmedTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (rewardDirection != null ? rewardDirection.hashCode() : 0);
        result = 31 * result + (channelNo != null ? channelNo.hashCode() : 0);
        result = 31 * result + (channelSource != null ? channelSource.hashCode() : 0);
        result = 31 * result + (transactionNo != null ? transactionNo.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (batchId != null ? batchId.hashCode() : 0);
        return result;
    }
}
