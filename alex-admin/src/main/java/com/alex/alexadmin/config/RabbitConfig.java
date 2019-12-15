package com.alex.alexadmin.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: rabbit configuration class
 * Author:     alex
 * CreateDate: 2019/12/10 19:11
 * Version:    1.0
 *
 */
@Configuration
public class RabbitConfig {

/*    *//**
     * 定义demoQueue队列
     * @return
     *//*
    @Bean
    public Queue demoString() {
        return new Queue("demoQueue");
    }*/
    /*广播模式*/
    @Bean
    public Queue fanoutA() {
        return new Queue("fanout.a");
    }

    @Bean
    public Queue fanoutB() {
        return new Queue("fanout.b");
    }

    @Bean
    public Queue fanoutC() {
        return new Queue("fanout.c");
    }

    /**
     * 定义个fanout交换器
     * @return
     */
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    /**
     * 将定义的fanoutA队列与fanoutExchange交换机绑定
     * @return
     */
    @Bean
    public Binding bindingExchangeWithA() {
        return BindingBuilder.bind(fanoutA()).to(fanoutExchange());
    }

    /**
     * 将定义的fanoutB队列与fanoutExchange交换机绑定
     * @return
     */
    @Bean
    public Binding bindingExchangeWithB() {
        return BindingBuilder.bind(fanoutB()).to(fanoutExchange());
    }

    /**
     * 将定义的fanoutC队列与fanoutExchange交换机绑定
     * @return
     */
    @Bean
    public Binding bindingExchangeWithC() {
        return BindingBuilder.bind(fanoutC()).to(fanoutExchange());
    }

    /*topic主题模式*/
    @Bean
    public Queue topicA() {
        return new Queue("topic.a");
    }

    @Bean
    public Queue topicB() {
        return new Queue("topic.b");
    }

    @Bean
    public Queue topicC() {
        return new Queue("topic.c");
    }

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding bindingTopicExchangeWithA(){
        return BindingBuilder.bind(topicA()).to(topicExchange()).with("topic.msg");
    }

    @Bean
    public Binding bindingTopicExchangeWithB() {
        return BindingBuilder.bind(topicB()).to(topicExchange()).with("topic.#");
    }

    @Bean
    public Binding bindingTopicExchangeWithC(){
        return BindingBuilder.bind(topicC()).to(topicExchange()).with("topic.*.z");
    }
}
