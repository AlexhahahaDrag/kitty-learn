package com.alex.alexadmin.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.b")
public class FanoutBConsumer {

    /**
     * 消息消费
     */
    @RabbitHandler
    public void received(String msg) {
        System.out.println("[fanout.b] received message:" + msg);
    }
}
