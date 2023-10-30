package com.Nikita.microservices.DBProject_customer_service.Dao;

import com.Nikita.microservices.DBProject_customer_service.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, String> {
	
	
}

