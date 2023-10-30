package com.Nikita.microservices.DBProject_customer_service.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Nikita.microservices.DBProject_customer_service.Dao.CustomerRepository;
import com.Nikita.microservices.DBProject_customer_service.Model.Customer;
import com.Nikita.microservices.DBProject_customer_service.Model.CustomerDTO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController{
	@Autowired
	CustomerRepository customerRepo;
	
	@GetMapping("customer/getCustomers")
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        List<Customer> customersList = customerRepo.findAll();
        List<CustomerDTO> customersDTOList = new ArrayList<CustomerDTO>();
        System.out.println("request coming from gateway !!!");
        for(Customer cust:customersList) {
        	CustomerDTO dto =new CustomerDTO();
        	dto.setAddress(cust.getAddress());
        	dto.setId_no(cust.getId_no());
        	dto.setName(cust.getName());
        	dto.setEditable(false);
        	customersDTOList.add(dto);
        }
        System.out.println(customersDTOList);
        return new ResponseEntity<>(customersDTOList, HttpStatus.OK);
    }
	
	@PostMapping("/customer/addCustomer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer cust) {
		try {
			 System.out.println("request coming from gateway to insert!!!");
			System.out.println("cust"+cust);
			customerRepo.save(cust);
			return new ResponseEntity<>("Customer is added successfully", HttpStatus.OK);// Authentication failed
		}catch(Exception e) {
			
			
			 return new ResponseEntity<>("Error while adding customer", HttpStatus.BAD_REQUEST);// Authentication failed
		}
	 
		 
	   
	}
	

}