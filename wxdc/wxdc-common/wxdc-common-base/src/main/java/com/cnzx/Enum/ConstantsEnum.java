package com.cnzx.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConstantsEnum {
       // 订单状态
    NEW("0","新订单"),
    FINISH("1","已完成"),
    CANCEL("2","已取消"),

    // 支付状态
    WAIT("0","等待支付"),
    SUCCESS("1","支付成功"),

    // 商品状态
    UP("1","上架"),
    DOWN("2","下架")

    ;

    private String code;
    private String name;
}
