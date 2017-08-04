package com.mk.share.mdse.api.vo;

import java.io.Serializable;

/**
 * 商品VO
 *
 * @author wanghao
 * @create 2017-08-02 19:34
 */
public class MdseVo implements Serializable{

    private static final long serialVersionUID = 1335930252177910418L;

    private String mdseCode;
    private String mdseName;

    public String getMdseCode() {
        return mdseCode;
    }

    public void setMdseCode(String mdseCode) {
        this.mdseCode = mdseCode;
    }

    public String getMdseName() {
        return mdseName;
    }

    public void setMdseName(String mdseName) {
        this.mdseName = mdseName;
    }
}
