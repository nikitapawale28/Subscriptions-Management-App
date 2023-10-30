package com.Nikita.microservices.DBProject_subscriptions_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DbProjectSubscriptionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbProjectSubscriptionsServiceApplication.class, args);
	}

}
