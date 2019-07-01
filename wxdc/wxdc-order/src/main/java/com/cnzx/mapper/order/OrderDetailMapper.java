package com.cnzx.mapper.order;

import com.cnzx.entities.order.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    Boolean saveOrderDetail(List<OrderDetail> orderDetail);
}
