package com.mk.share.order.api.enums;

/**
 * 订单枚举类
 *
 * @author MonkeyKing
 * @create 2017-08-01 18:03
 */
public class OrderEnums {
    public enum OrderStatus{
        TO_PAY(1,"待支付"),
        PAY_FINISH(2,"已支付"),
        CANCEL(3,"已取消"),
        END(4,"已完成");

        private Integer code;
        private String value;

        OrderStatus(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }
    }
}
