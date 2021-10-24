package com.example.service_video;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ServiceVideoApplicationTests {
	@Autowired
	private AmqpAdmin amqpAdmin;

	@Test
	public void createExchange(){
		TopicExchange topicExchange = new TopicExchange("save-exchange");
		amqpAdmin.declareExchange(topicExchange);
		System.out.println("Exchange创建成功");
	}
	@Test
	public void createQueue(){
		Queue queue = new Queue("save-queue");
		amqpAdmin.declareQueue(queue);
		System.out.println("Queue创建成功");
	}
	@Test
	public void createBinding(){
		Binding binding = new Binding("save-queue",Binding.DestinationType.QUEUE,"save-exchange","sava.java",null);
		amqpAdmin.declareBinding(binding);
		System.out.println("Binding创建成功");
	}

}
