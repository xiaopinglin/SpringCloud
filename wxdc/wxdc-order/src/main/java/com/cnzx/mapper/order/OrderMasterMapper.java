package com.cnzx.mapper.order;

import com.cnzx.entities.order.OrderMaster;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMasterMapper {

    void createOrderMaster(OrderMaster orderMaster);

}
