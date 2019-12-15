package com.alex.alexadmin.controller;

import com.alex.alexadmin.mq.RabbitProducer;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: hello controller test
 * Author:     alex
 * CreateDate: 2019/12/15 19:11
 * Version:    1.0
 *
 */
@Api(value ="RabbitMqController", tags={"队列管理"})
@RestController
@RequestMapping("/rabbitMq")
public class RabbitMqController {

    @Autowired
    private RabbitProducer rabbitProducer;

    @GetMapping("/getDemoQueue")
    public Object sendDemoQueue() {
        rabbitProducer.sendDemoQueue();
        return "success";
    }

    @GetMapping("/sendFanout")
    public Object sndFanout() {
        rabbitProducer.sendFanout();
        return "success";
    }

    @GetMapping("/sendTopicA")
    public Object sendTopicA(){
        rabbitProducer.sendTopicA();
        return "success";
    }

    @GetMapping("/sendTopicB")
    public Object sendTopicB(){
        rabbitProducer.sendTopicB();
        return "success";
    }

    @GetMapping("/sendTopicC")
    public Object sendTopicC(){
        rabbitProducer.sendTopicC();
        return "success";
    }
}
