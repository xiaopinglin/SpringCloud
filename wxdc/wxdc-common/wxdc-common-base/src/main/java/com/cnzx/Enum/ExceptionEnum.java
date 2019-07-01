package com.cnzx.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {
    // 公共返回代码
    DO_SUCEESS("200","操作成功！"),
    DO_FAILE("500","操作失败！"),

    // 商品返回码
    PRODUCT_NOT_EXISTS("1001","商品不存在！"),
    PRODUCT_LOW_STOCK("1002","商品库存不足！"),

    // 订单返回码

    ;

    private String code;
    private String name;
}
