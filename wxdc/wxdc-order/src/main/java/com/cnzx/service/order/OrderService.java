package com.cnzx.service.order;

import com.cnzx.dto.order.CreateOrderDTO;
import com.cnzx.entities.common.JsonBean;

public interface OrderService {

    JsonBean createOrder(CreateOrderDTO createOrderDTO);

    JsonBean asynCreateOrder(CreateOrderDTO createOrderDTO);
}
