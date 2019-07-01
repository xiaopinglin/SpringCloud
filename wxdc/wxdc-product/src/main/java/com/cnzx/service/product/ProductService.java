package com.cnzx.service.product;

import com.cnzx.dto.product.UpdateProductStockDTO;
import com.cnzx.entities.common.JsonBean;
import com.cnzx.entities.product.ProductInfo;

import java.util.List;

public interface ProductService {

    JsonBean getProductList();

    List<ProductInfo> getProductListByIds(List<String> ids);

    JsonBean updateProductStock(List<UpdateProductStockDTO> updateProductStockDTOList);
}
