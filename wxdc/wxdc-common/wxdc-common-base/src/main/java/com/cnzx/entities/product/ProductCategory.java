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
public class ProductCategory implements Serializable {

    private String id;
    private String categoryCode; //商品类目编码
    private String categoryName; //商品类目名称

    private String creator;
    private Date createTime;
    private String updator;
    private Date updateTime;
}
