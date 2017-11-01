package mk.share.order.web.vo;

import java.io.Serializable;

/**
 * @author wanghao
 * @create 2017-10-19 17:29
 */
public class ResponseVo implements Serializable{
    private static final long serialVersionUID = -500435426631533122L;
    private String publicKey;
    private String data;
    private String signature;

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
