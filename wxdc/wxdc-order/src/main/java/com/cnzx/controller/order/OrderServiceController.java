package com.cnzx.controller.order;

import com.cnzx.dto.order.CreateOrderDTO;
import com.cnzx.dto.order.CreateOrderDetailDTO;
import com.cnzx.entities.common.JsonBean;
import com.cnzx.entities.order.OrderDetail;
import com.cnzx.message.StreamClient;
import com.cnzx.service.order.OrderService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "order")
public class OrderServiceController {

    @Autowired
    private OrderService orderService;

    @Resource
    private StreamClient streamClient;

    /**
     * 生成订单
     * @param
     * @return
     */
    @RequestMapping(value = "createOrder")
    public JsonBean CreateOrder(){
        CreateOrderDTO createOrderDTO = new CreateOrderDTO();
        createOrderDTO.setClientCode("admin");
        createOrderDTO.setClientName("系统管理员");
        createOrderDTO.setClientPhone("18850413505");
        createOrderDTO.setClientAddress("成都市武侯区人民南路四段来福士写字楼T2栋28楼");
        createOrderDTO.setClientOpenId("xsaxxxxxxxxxxasxxxxx");

        List<CreateOrderDetailDTO> list = new ArrayList<>();

        CreateOrderDetailDTO createOrderDetailDTO = new CreateOrderDetailDTO();
        createOrderDetailDTO.setId("20181228151233969963713034000001");
        createOrderDetailDTO.setProductCounts(5);
        list.add(createOrderDetailDTO);

        CreateOrderDetailDTO createOrderDetailDTO2 = new CreateOrderDetailDTO();
        createOrderDetailDTO2.setId("20181228151233969974143919000001");
        createOrderDetailDTO2.setProductCounts(3);
        list.add(createOrderDetailDTO2);

        createOrderDTO.setCreateOrderDetailDTOList(list);

        return orderService.createOrder(createOrderDTO);
    }

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public  void testString(){
        //amqpTemplate.convertAndSend("myQueues","new" + new Date());
        //amqpTemplate.convertAndSend("myOrder","computer","new" + new Date());
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId("20192212sad");
        streamClient.output().send(MessageBuilder.withPayload(orderDetail).build());
    }

}
