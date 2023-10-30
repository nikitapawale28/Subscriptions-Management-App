package com.Nikita.microservices.DBProject_customer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DbProjectCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbProjectCustomerServiceApplication.class, args);
	}

}
