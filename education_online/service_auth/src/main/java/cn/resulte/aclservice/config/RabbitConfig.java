package cn.resulte.aclservice.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.listener.Topic;

@Configuration
public class RabbitConfig {
    @Autowired
    private static AmqpAdmin amqpAdmin;

    @Autowired
    private RabbitTemplate rabbitTemplate;

//    static void createExchange(){
//        TopicExchange topicExchange = new TopicExchange("save-exchange");
//        amqpAdmin.declareExchange(topicExchange);
//        System.out.println("Exchange创建成功");
//    }
//
//    static void createQueue(){
//        Queue queue = new Queue("save-queue");
//        amqpAdmin.declareQueue(queue);
//        System.out.println("Queue创建成功");
//    }
//
//    static void createBinding(){
//        Binding binding = new Binding("save-queue",Binding.DestinationType.QUEUE,"save-exchange","sava.java",null);
//        amqpAdmin.declareBinding(binding);
//        System.out.println("Binding创建成功");
//    }

    public void sendMessenge(String token){
        rabbitTemplate.convertAndSend("save-exchange","sava.java",token);
        System.out.println("消息发送成功");
    }
}
