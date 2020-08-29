package com.config;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class Config {
	
	private String brokerUrl="tcp://localhost:61616";
	
	
	@Bean
	public Queue queue() {
		
		
		return new ActiveMQQueue("naveen.queue");
		
	}

	@Bean
	public ActiveMQConnectionFactory activeFactory() {
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
		factory.setBrokerURL(brokerUrl);
		
		return factory ;
		
	}
	
	public JmsTemplate jmsTemplate() {
		return new JmsTemplate(activeFactory());
	}
}
