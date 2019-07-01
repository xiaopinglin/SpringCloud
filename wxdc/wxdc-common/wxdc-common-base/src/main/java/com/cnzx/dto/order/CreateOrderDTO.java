package com.cnzx.dto.order;

import lombok.Data;

import java.util.List;

@Data
public class CreateOrderDTO {

    private String clientCode; // 客户编号
    private String clientName; // 客户名称
    private String clientPhone; // 客户手机
    private String clientAddress; // 客户地址
    private String clientOpenId; // 客户微信Id
    private List<CreateOrderDetailDTO> createOrderDetailDTOList;  //订单商品详情
}
