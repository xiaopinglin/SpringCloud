package com.cnzx.service.product.impl;

import com.cnzx.Enum.ExceptionEnum;
import com.cnzx.dto.product.UpdateProductStockDTO;
import com.cnzx.entities.common.JsonBean;
import com.cnzx.entities.product.ProductCategory;
import com.cnzx.entities.product.ProductInfo;
import com.cnzx.mapper.product.ProductCategoryMapper;
import com.cnzx.mapper.product.ProductInfoMapper;
import com.cnzx.service.product.ProductService;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductCategoryMapper productCategoryMapper;

    @Resource
    private ProductInfoMapper productInfoMapper;

    @Override
    public JsonBean getProductList() {
        JsonBean Json = new JsonBean();
        // 获取商品列表
        JSONArray data = new JSONArray();
        ProductCategory productCategory = new ProductCategory();
        List<ProductCategory> pc_list = productCategoryMapper.getProductCategoryAll(productCategory);
        if(pc_list.size()>0){
            for (ProductCategory pdc : pc_list){
                JSONObject obj = new JSONObject();
                obj.put("categoryCode",pdc.getCategoryCode());
                obj.put("CategoryName",pdc.getCategoryName());

                ProductInfo productInfo = new ProductInfo();
                productInfo.setCategoryCode(pdc.getCategoryCode());
                List<ProductInfo> pi_list = productInfoMapper.getProductInfoAll(productInfo);
                if(pi_list.size()>0){
                    JSONArray foods = new JSONArray();
                    for (ProductInfo pdi: pi_list){
                        JSONObject food = new JSONObject();
                        food.put("productCode",pdi.getProductCode());
                        food.put("productName",pdi.getProductName());
                        food.put("productPrice",pdi.getProductPrice());
                        food.put("productDecription",pdi.getProductDecription());
                        food.put("productIcon",pdi.getProductIcon());

                        foods.add(food);
                    }

                    obj.put("foods",foods);
                }else{
                    obj.put("foods",null);
                }
                data.add(obj);
            }
        }
        Json.setObj(data);
        return Json;
    }

    @Override
    public List<ProductInfo> getProductListByIds(List<String> ids) {
        List<ProductInfo> list = new ArrayList<>();
        if(ids.size()>0){
            for(int i=0;i<ids.size();i++){
                String id = ids.get(i);
                ProductInfo productInfo = productInfoMapper.getProductInfoById(id);
                list.add(productInfo);
            }
        }
        return list;
    }

    @Override
    public JsonBean updateProductStock(List<UpdateProductStockDTO> updateProductStockDTOList) {
        JsonBean Json = new JsonBean();
        if(updateProductStockDTOList.size()>0){
            for (UpdateProductStockDTO ups: updateProductStockDTOList){
                //判断库存是否充足
                List<ProductInfo> list = productInfoMapper.getProductByIdAndStock(ups);
                if(list.size()>0){
                     if (!productInfoMapper.updateProductStockById(ups)){
                        Json.setSuccess(false);
                        Json.setCode(ExceptionEnum.DO_FAILE.getCode());
                        Json.setMsg(ExceptionEnum.DO_FAILE.getName());
                        return Json;
                     }
                }else{
                    Json.setSuccess(false);
                    Json.setCode(ExceptionEnum.PRODUCT_LOW_STOCK.getCode());
                    Json.setMsg(ExceptionEnum.PRODUCT_LOW_STOCK.getName());
                    return Json;
                }
            }
        }else{
            Json.setSuccess(false);
            Json.setCode(ExceptionEnum.DO_FAILE.getCode());
            Json.setMsg(ExceptionEnum.DO_FAILE.getName());
            return Json;
        }
        return Json;
    }
}
