package com.alex.alexadmin.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class RabbitProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendDemoQueue() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println("[demoQueue] send msg: " + dateString);
        this.rabbitTemplate.convertAndSend("demoQueue", dateString);
    }

    public void sendFanout() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println("[fanout] send msg: " + dateString);
        this.rabbitTemplate.convertAndSend("fanoutExchange", "",dateString);
    }

    public void sendTopicA() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        dateString = "[topic.msg] send msg:" + dateString;
        System.out.println(dateString);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.msg", dateString);
    }

    public void sendTopicB() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        dateString = "[topic.good.msg] send msg:" + dateString;
        System.out.println(dateString);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.good.msg", dateString);
    }

    public void sendTopicC() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        dateString = "[topic.*.z] send msg:" + dateString;
        System.out.println(dateString);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.*.z", dateString);
    }
}
