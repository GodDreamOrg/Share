package mk.share.order.web.vo;

import java.io.Serializable;

/**
 * @author wanghao
 * @create 2017-10-19 17:35
 */
public class PhysicVo implements Serializable {
    private static final long serialVersionUID = -2684585841116446371L;
    private String codeStatus;
    private String codeStatusDesc;
    private String drugId;
    private String productEntName;
    private String physicName ;
    private String prepnType ;
    private String prepnSpec ;

    public String getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(String codeStatus) {
        this.codeStatus = codeStatus;
    }

    public String getCodeStatusDesc() {
        return codeStatusDesc;
    }

    public void setCodeStatusDesc(String codeStatusDesc) {
        this.codeStatusDesc = codeStatusDesc;
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getProductEntName() {
        return productEntName;
    }

    public void setProductEntName(String productEntName) {
        this.productEntName = productEntName;
    }

    public String getPhysicName() {
        return physicName;
    }

    public void setPhysicName(String physicName) {
        this.physicName = physicName;
    }

    public String getPrepnType() {
        return prepnType;
    }

    public void setPrepnType(String prepnType) {
        this.prepnType = prepnType;
    }

    public String getPrepnSpec() {
        return prepnSpec;
    }

    public void setPrepnSpec(String prepnSpec) {
        this.prepnSpec = prepnSpec;
    }
}
