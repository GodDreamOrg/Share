package com.mk.share.order.api.enums;

/**
 * 订单枚举类
 *
 * @author MonkeyKing
 * @create 2017-08-01 18:03
 */
public class OrderEnums {
    public enum Status {
        TO_SEND(1,"待发货"),
        TO_DISTRIBUTION(2,"待配送"),
        TO_TAKE_OVER(3,"待收货"),
        END(4,"已完成");

        private Integer code;
        private String value;

        Status(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
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
