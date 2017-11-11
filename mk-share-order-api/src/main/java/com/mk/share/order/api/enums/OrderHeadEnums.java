package com.mk.share.order.api.enums;

/**
 * 主订单枚举集合
 *
 * @author wanghao
 * @create 2017-11-11 16:59
 */
public class OrderHeadEnums {
    public enum Status {
        TO_PAYMENT(1,"待支付"),
        TO_SPLIT(2,"待拆单"),
        SPLIT_END(3,"已拆单")
        ;
        private Integer code;
        private String value;

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

        Status(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Status getByCode(Integer code){
            for (Status status : Status.values()) {
                if (status.getCode().equals(code)){
                    return status;
                }
            }
            return null;
        }
    }
}
