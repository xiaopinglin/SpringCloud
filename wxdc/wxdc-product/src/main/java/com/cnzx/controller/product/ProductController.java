package com.cnzx.controller.product;

import com.cnzx.dto.product.UpdateProductStockDTO;
import com.cnzx.entities.common.JsonBean;
import com.cnzx.entities.product.ProductInfo;
import com.cnzx.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 获取所以类目下商品的列表
     * @return
     */
    @RequestMapping(value = "getProductList")
    public JsonBean getProductList(){
        return productService.getProductList();
    }


    /**
     * 根据商品Id获取商品信息列表
     * @param ids
     * @return
     */
    @PostMapping(value = "getProductListByIds")
    public List<ProductInfo> getProductListByIds(@RequestBody  List<String> ids){
        return productService.getProductListByIds(ids);
    }

    /**
     * 更新库存
     * @param updateProductStockDTOList
     * @return
     */
    @PostMapping(value = "updateProductStock")
    public JsonBean updateProductStock(@RequestBody List<UpdateProductStockDTO> updateProductStockDTOList){
        return productService.updateProductStock(updateProductStockDTOList);
    }

}
