package com.qa.producer.config;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public ConnectionFactory activeMqConnectionFactory() {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		return connectionFactory;
	}
}
