package com.cnzx.message;

import com.cnzx.entities.order.OrderDetail;
import com.esotericsoftware.minlog.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableBinding(StreamClient.class)
public class StreamReceiver {

    @StreamListener(StreamClient.RECEVICE_INPUT)
    //@SendTo(StreamClient.RECEVICE_INPUT) 返回
    public void process(OrderDetail msg){
        Log.info("Stream Receiver Message is " + msg);
    }
}