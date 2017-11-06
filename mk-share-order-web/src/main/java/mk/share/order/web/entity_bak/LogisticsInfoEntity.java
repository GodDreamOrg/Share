package mk.share.order.web.entity_bak;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wanghao
 * @create 2017-11-06 9:59
 */
@Entity
@Table(name = "t_ssc_logistics_info", schema = "share_order", catalog = "")
public class LogisticsInfoEntity {
    private Long id;
    private String deliveryNo;
    private String email;
    private String provinceCode;
    private String cityCode;
    private String receiverMobile;
    private String receiverAddress;
    private String receiverName;
    private String logisticsCompanyName;
    private String logisticsCompanyCode;
    private Date distributionTime;
    private String provinceDescription;
    private String cityDescription;
    private String areaDescription;
    private Integer distributionMode;
    private String orderCode;
    private Integer distributionStatus;
    private String distributionRemark;
    private String areaCode;
    private String zipCode;
    private Date createDate;

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DELIVERY_NO", nullable = true, length = 64)
    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 300)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PROVINCE_CODE", nullable = true, length = 20)
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Basic
    @Column(name = "CITY_CODE", nullable = true, length = 20)
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "RECEIVER_MOBILE", nullable = true, length = 20)
    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    @Basic
    @Column(name = "RECEIVER_ADDRESS", nullable = true, length = 500)
    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    @Basic
    @Column(name = "RECEIVER_NAME", nullable = true, length = 50)
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "LOGISTICS_COMPANY_NAME", nullable = true, length = 200)
    public String getLogisticsCompanyName() {
        return logisticsCompanyName;
    }

    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName;
    }

    @Basic
    @Column(name = "LOGISTICS_COMPANY_CODE", nullable = true, length = 64)
    public String getLogisticsCompanyCode() {
        return logisticsCompanyCode;
    }

    public void setLogisticsCompanyCode(String logisticsCompanyCode) {
        this.logisticsCompanyCode = logisticsCompanyCode;
    }

    @Basic
    @Column(name = "DISTRIBUTION_TIME", nullable = true)
    public Date getDistributionTime() {
        return distributionTime;
    }

    public void setDistributionTime(Date distributionTime) {
        this.distributionTime = distributionTime;
    }

    @Basic
    @Column(name = "PROVINCE_DESCRIPTION", nullable = true, length = 200)
    public String getProvinceDescription() {
        return provinceDescription;
    }

    public void setProvinceDescription(String provinceDescription) {
        this.provinceDescription = provinceDescription;
    }

    @Basic
    @Column(name = "CITY_DESCRIPTION", nullable = true, length = 200)
    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    @Basic
    @Column(name = "AREA_DESCRIPTION", nullable = true, length = 200)
    public String getAreaDescription() {
        return areaDescription;
    }

    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
    }

    @Basic
    @Column(name = "DISTRIBUTION_MODE", nullable = true)
    public Integer getDistributionMode() {
        return distributionMode;
    }

    public void setDistributionMode(Integer distributionMode) {
        this.distributionMode = distributionMode;
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
    @Column(name = "DISTRIBUTION_STATUS", nullable = true)
    public Integer getDistributionStatus() {
        return distributionStatus;
    }

    public void setDistributionStatus(Integer distributionStatus) {
        this.distributionStatus = distributionStatus;
    }

    @Basic
    @Column(name = "DISTRIBUTION_REMARK", nullable = true, length = 1024)
    public String getDistributionRemark() {
        return distributionRemark;
    }

    public void setDistributionRemark(String distributionRemark) {
        this.distributionRemark = distributionRemark;
    }

    @Basic
    @Column(name = "AREA_CODE", nullable = true, length = 20)
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Basic
    @Column(name = "ZIP_CODE", nullable = true, length = 6)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogisticsInfoEntity that = (LogisticsInfoEntity) o;

        if (id != that.id) return false;
        if (deliveryNo != null ? !deliveryNo.equals(that.deliveryNo) : that.deliveryNo != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (provinceCode != null ? !provinceCode.equals(that.provinceCode) : that.provinceCode != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (receiverMobile != null ? !receiverMobile.equals(that.receiverMobile) : that.receiverMobile != null) return false;
        if (receiverAddress != null ? !receiverAddress.equals(that.receiverAddress) : that.receiverAddress != null) return false;
        if (receiverName != null ? !receiverName.equals(that.receiverName) : that.receiverName != null) return false;
        if (logisticsCompanyName != null ? !logisticsCompanyName.equals(that.logisticsCompanyName) : that.logisticsCompanyName != null) return false;
        if (logisticsCompanyCode != null ? !logisticsCompanyCode.equals(that.logisticsCompanyCode) : that.logisticsCompanyCode != null) return false;
        if (distributionTime != null ? !distributionTime.equals(that.distributionTime) : that.distributionTime != null) return false;
        if (provinceDescription != null ? !provinceDescription.equals(that.provinceDescription) : that.provinceDescription != null) return false;
        if (cityDescription != null ? !cityDescription.equals(that.cityDescription) : that.cityDescription != null) return false;
        if (areaDescription != null ? !areaDescription.equals(that.areaDescription) : that.areaDescription != null) return false;
        if (distributionMode != null ? !distributionMode.equals(that.distributionMode) : that.distributionMode != null) return false;
        if (orderCode != null ? !orderCode.equals(that.orderCode) : that.orderCode != null) return false;
        if (distributionStatus != null ? !distributionStatus.equals(that.distributionStatus) : that.distributionStatus != null) return false;
        if (distributionRemark != null ? !distributionRemark.equals(that.distributionRemark) : that.distributionRemark != null) return false;
        if (areaCode != null ? !areaCode.equals(that.areaCode) : that.areaCode != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (deliveryNo != null ? deliveryNo.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (provinceCode != null ? provinceCode.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (receiverMobile != null ? receiverMobile.hashCode() : 0);
        result = 31 * result + (receiverAddress != null ? receiverAddress.hashCode() : 0);
        result = 31 * result + (receiverName != null ? receiverName.hashCode() : 0);
        result = 31 * result + (logisticsCompanyName != null ? logisticsCompanyName.hashCode() : 0);
        result = 31 * result + (logisticsCompanyCode != null ? logisticsCompanyCode.hashCode() : 0);
        result = 31 * result + (distributionTime != null ? distributionTime.hashCode() : 0);
        result = 31 * result + (provinceDescription != null ? provinceDescription.hashCode() : 0);
        result = 31 * result + (cityDescription != null ? cityDescription.hashCode() : 0);
        result = 31 * result + (areaDescription != null ? areaDescription.hashCode() : 0);
        result = 31 * result + (distributionMode != null ? distributionMode.hashCode() : 0);
        result = 31 * result + (orderCode != null ? orderCode.hashCode() : 0);
        result = 31 * result + (distributionStatus != null ? distributionStatus.hashCode() : 0);
        result = 31 * result + (distributionRemark != null ? distributionRemark.hashCode() : 0);
        result = 31 * result + (areaCode != null ? areaCode.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
