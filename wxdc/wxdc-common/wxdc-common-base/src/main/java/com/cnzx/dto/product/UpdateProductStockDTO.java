package com.cnzx.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductStockDTO {

    private String id;  //商品Id
    private Integer productStock; // 商品数量


}
