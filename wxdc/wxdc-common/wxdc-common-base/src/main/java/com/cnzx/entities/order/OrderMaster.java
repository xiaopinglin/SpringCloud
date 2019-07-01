package com.cnzx.entities.order;

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
public class OrderMaster implements Serializable {

    private String id;
    private String orderNum; // 订单编号
    private Double orderAmount; // 订单金额
    private String orderStatus; // 订单状态
    private String payStatus;  // 支付状态
    private String clientCode; // 客户编号
    private String clientName; // 客户名称
    private String clientPhone; // 客户手机
    private String clientAddress; // 客户地址
    private String clientOpenId; // 客户微信Id

    private String creator;
    private Date createTime;
    private String updator;
    private Date updateTime;
}
