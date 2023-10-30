package com.Nikita.microservices.DBProject_publications_service.Controller;

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


import com.Nikita.microservices.DBProject_publications_service.Dao.PublicationsRepository;
import com.Nikita.microservices.DBProject_publications_service.Model.Publications;
import com.Nikita.microservices.DBProject_publications_service.Model.PublicationsDTO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PublicationsController {

	@Autowired
	PublicationsRepository pubRepo;
	@GetMapping("publications/getPublications")
    public ResponseEntity<List<Publications>> getAllCustomers() {
        List<Publications> pubList = pubRepo.findAll();
        List<PublicationsDTO> pubDTOList = new ArrayList<PublicationsDTO>();
        for(Publications pub : pubList) {
        	PublicationsDTO pubDTO = new PublicationsDTO();
        	pubDTO.setName(pub.getName());
        	pubDTO.setPub_type(pub.getPub_type());
        	pubDTO.setEditable(false);
        	pubDTO.setShowConfirm(false);
        }
        System.out.println(pubList);
        return new ResponseEntity<>(pubList, HttpStatus.OK);
    }
	
	
	@PostMapping("/publications/addPublication")
	public ResponseEntity<String> addCustomer(@RequestBody Publications pub) {
		try {
			System.out.println("inside add publication");
			pubRepo.save(pub);
			return new ResponseEntity<>("Customer is added successfully", HttpStatus.OK);// Authentication failed
		}catch(Exception e) {
			
			
			 return new ResponseEntity<>("Error while adding customer", HttpStatus.BAD_REQUEST);// Authentication failed
		}
	 
		 
	   
	}
}
