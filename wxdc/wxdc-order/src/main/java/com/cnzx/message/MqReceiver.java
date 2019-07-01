package com.cnzx.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MqReceiver {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueues"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String msg){
        log.info("MqReceiver ： {}",msg);
    }


    @RabbitListener(bindings = @QueueBinding(exchange = @Exchange("myOrder"), key = "computer", value = @Queue("computerOrder")))
    public void processConputer(String msg){
        log.info("Computer MqReceiver ： {}",msg);
    }

    @RabbitListener(bindings = @QueueBinding(exchange = @Exchange("myOrder"), key = "fruit",value = @Queue("fruitOrder")))
    public void processFruit(String msg){
        log.info("fruit MqReceiver ： {}",msg);
    }
}
