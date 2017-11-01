package mk.share.order.web.vo;

import java.io.Serializable;

/**
 * @author wanghao
 * @create 2017-10-19 17:32
 */
public class ResultVo<T> implements Serializable{
    private static final long serialVersionUID = 859368545424322195L;
    private String retCode;
    private String retMessage;
    private T result;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
