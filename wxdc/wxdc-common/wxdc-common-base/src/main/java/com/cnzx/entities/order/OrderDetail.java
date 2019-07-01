package com.cnzx.entities.order;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class OrderDetail implements Serializable {

    private String id;
    private String orderNum; // 订单编号
    private String productCode; // 商品编码
    private String productName; // 商品名称
    private Double productPrice; // 商品价格
    private Integer productCounts; // 商品数量
    private String productIcon; // 商品图标

    private String creator;
    private Date createTime;
    private String updator;
    private Date updateTime;
}
