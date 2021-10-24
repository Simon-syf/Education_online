package com.example.service_video;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {

    @RabbitListener(queues = {"save-queue"})
    public void recieveMessage(Object mes){
        String token = mes.toString();
        System.out.println("-----------------"+token);
        System.out.println("收到消息 正在存储token");
    }

}
