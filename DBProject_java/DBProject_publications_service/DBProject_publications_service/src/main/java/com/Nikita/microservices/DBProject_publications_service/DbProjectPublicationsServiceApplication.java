package com.Nikita.microservices.DBProject_publications_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;

  
@SpringBootApplication
@EnableFeignClients
public class DbProjectPublicationsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbProjectPublicationsServiceApplication.class, args);
	}

}
