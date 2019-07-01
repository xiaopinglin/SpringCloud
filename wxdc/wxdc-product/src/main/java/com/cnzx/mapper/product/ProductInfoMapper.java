package com.cnzx.mapper.product;

import com.cnzx.dto.product.UpdateProductStockDTO;
import com.cnzx.entities.product.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductInfoMapper {

    List<ProductInfo> getProductInfoAll(ProductInfo productInfo);

    ProductInfo getProductInfoById(@Param("Id") String Id);

    List<ProductInfo> getProductByIdAndStock(UpdateProductStockDTO updateProductStockDTO);

    Boolean updateProductStockById(UpdateProductStockDTO updateProductStockDTO);

 }
