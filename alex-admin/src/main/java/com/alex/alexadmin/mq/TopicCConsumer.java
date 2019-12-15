package com.alex.alexadmin.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.c")
public class TopicCConsumer {

    @RabbitHandler
    public void received(String msg) {
        System.out.println("[topic.c] received message:" + msg);
    }
}
