package com.cnzx.entities.product;


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
public class ProductInfo implements Serializable {

    private String id; //主键
    private String productCode; //商品编码
    private String productName; //商品名称
    private Double productPrice; //商品价格
    private Integer productStock; //商品库存
    private String productDecription; //商品描述
    private String productIcon;  //商品图标
    private String productStauts; // 商品状态
    private String categoryCode; // 商品类目

    private String creator;
    private Date createTime;
    private String updator;
    private Date updateTime;
}
