package com.alex.alexadmin.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.a")
public class TopicAConsumer {

    @RabbitHandler
    public void received(String msg) {
        System.out.println("[topic.a] received message:" + msg);
    }
}
