package com.cnzx.mapper.product;

import com.cnzx.entities.product.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {

    List<ProductCategory> getProductCategoryAll(ProductCategory productCategory);

    ProductCategory getProductCategoryById(@Param("Id") String Id);

    Boolean saveProductCategory(ProductCategory productCategory);

    Boolean updateProductCategoryById(ProductCategory productCategory);

    Boolean deleteProductCategoryById(@Param("Id") String Id);
}
