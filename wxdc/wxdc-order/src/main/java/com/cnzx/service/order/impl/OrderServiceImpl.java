package com.cnzx.service.order.impl;

import com.cnzx.Enum.ConstantsEnum;
import com.cnzx.dto.order.CreateOrderDTO;
import com.cnzx.dto.order.CreateOrderDetailDTO;
import com.cnzx.dto.product.UpdateProductStockDTO;
import com.cnzx.entities.common.JsonBean;
import com.cnzx.entities.order.OrderDetail;
import com.cnzx.entities.order.OrderMaster;
import com.cnzx.entities.product.ProductInfo;
import com.cnzx.mapper.order.OrderDetailMapper;
import com.cnzx.mapper.order.OrderMasterMapper;
import com.cnzx.product.ProductServiceApi;
import com.cnzx.service.order.OrderService;
import com.cnzx.utils.GenID;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMasterMapper orderMasterMapper;

    @Resource
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private ProductServiceApi productServiceApi;

    /**
     * 使用同步的方式 生产订单
     * @param createOrderDTO
     * @return
     */
    @Override
    public JsonBean createOrder(CreateOrderDTO createOrderDTO) {
        JsonBean Json = new JsonBean();

        //生成订单编号（高并发情况下需要单独调用流水号服务，保证不会重复）
        String orderNum = GenID.gen(32);

        //① 获取商品信息
        List<CreateOrderDetailDTO> createOrderDetailDTOList = createOrderDTO.getCreateOrderDetailDTOList();
        List<String> ids = createOrderDetailDTOList.stream().map(CreateOrderDetailDTO::getId).collect(Collectors.toList());
        List<ProductInfo> list =  productServiceApi.getProductListByIds(ids);
        if(list.size()>0){
            List<OrderDetail> orderDetailList = new ArrayList<>();

            //②计算总金额
            Double orderAmount = new Double(0);
            for (CreateOrderDetailDTO createOrderDetailDTO : createOrderDetailDTOList){
                for (ProductInfo productInfo : list){
                    if(createOrderDetailDTO.getId().equals(productInfo.getId())){
                        orderAmount = orderAmount + productInfo.getProductPrice() * createOrderDetailDTO.getProductCounts();

                        // 订单详情数据准备
                        OrderDetail orderDetail = new OrderDetail();
                        orderDetail.setId(GenID.gen(32));
                        orderDetail.setOrderNum(orderNum);
                        orderDetail.setProductCode(productInfo.getProductCode());
                        orderDetail.setProductName(productInfo.getProductName());
                        orderDetail.setProductCounts(createOrderDetailDTO.getProductCounts());
                        orderDetail.setProductPrice(productInfo.getProductPrice());
                        orderDetail.setProductIcon(productInfo.getProductIcon());
                        orderDetail.setCreator("admin");
                        orderDetail.setCreateTime(new Date());
                        orderDetailList.add(orderDetail);
                    }
                }
            }

            //③更新库存
            List<UpdateProductStockDTO> updateProductStockDTOList = createOrderDetailDTOList.stream().map(e ->new UpdateProductStockDTO(e.getId(),e.getProductCounts())).collect(Collectors.toList());
            productServiceApi.updateProductStock(updateProductStockDTOList);

            // ④ 订单入库（订单 + 订单详情）
            OrderMaster orderMaster = new OrderMaster();
            orderMaster.setId(GenID.gen(32));
            orderMaster.setOrderNum(orderNum);
            orderMaster.setOrderAmount(orderAmount);
            orderMaster.setOrderStatus(ConstantsEnum.NEW.getCode());
            orderMaster.setPayStatus(ConstantsEnum.WAIT.getCode());
            orderMaster.setCreator("admin");
            orderMaster.setCreateTime(new Date());

            BeanUtils.copyProperties(createOrderDTO,orderMaster);
            orderMasterMapper.createOrderMaster(orderMaster);

            orderDetailMapper.saveOrderDetail(orderDetailList);
        }
        return Json;
    }

    /**
     * 通过异步的方式 生产订单
     * @param createOrderDTO
     * @return
     */
    @Override
    public JsonBean asynCreateOrder(CreateOrderDTO createOrderDTO) {
        JsonBean Json = new JsonBean();

        return Json;
    }
}
