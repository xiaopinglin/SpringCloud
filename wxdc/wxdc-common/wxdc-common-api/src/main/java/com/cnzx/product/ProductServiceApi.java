package com.cnzx.product;

import com.cnzx.dto.product.UpdateProductStockDTO;
import com.cnzx.entities.common.JsonBean;
import com.cnzx.entities.product.ProductInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 商品服务接口
 */
@FeignClient(name = "WXDC-PRODUCT")
public interface ProductServiceApi {

    /**
     * 根据Ids获取商品信息列表
     * @param ids
     * @return
     */
    @PostMapping(value = "/product/getProductListByIds")
    List<ProductInfo> getProductListByIds(@RequestBody List<String> ids);

    /**
     * 更新库存
     * @param updateProductStockDTOList
     * @return
     */
    @PostMapping(value = "/product/updateProductStock")
    JsonBean updateProductStock(@RequestBody List<UpdateProductStockDTO> updateProductStockDTOList);
}
