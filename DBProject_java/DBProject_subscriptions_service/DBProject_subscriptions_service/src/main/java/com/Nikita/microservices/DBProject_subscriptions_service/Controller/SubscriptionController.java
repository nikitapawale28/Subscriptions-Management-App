package com.Nikita.microservices.DBProject_subscriptions_service.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import com.Nikita.microservices.DBProject_subscriptions_service.Dao.SubscriptionRepository;
import com.Nikita.microservices.DBProject_subscriptions_service.Model.Subscription;
import com.Nikita.microservices.DBProject_subscriptions_service.Model.SubscriptionDTO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SubscriptionController {

	@Autowired
	SubscriptionRepository subRepo;
	@GetMapping("subscription/getSubscriptions")
    public ResponseEntity<List<SubscriptionDTO>> getAllCustomers() {
        List<Subscription> subList = subRepo.findAll();
        List<SubscriptionDTO> subDTOList = new ArrayList<SubscriptionDTO>();
        for(Subscription sub: subList) {
        	SubscriptionDTO subDTO = new SubscriptionDTO();
        	subDTO.setCust_id(sub.getCust_id());
        	subDTO.setEnd_date(sub.getEnd_date());
        	subDTO.setStart_date(sub.getStart_date());
        	subDTO.setPrice(sub.getPrice());
        	subDTO.setSub_id(sub.getSub_id());
        	subDTO.setSub_type(sub.getSub_type());
        	subDTO.setEditable(false);
        	subDTO.setShowConfirm(false);
        	subDTOList.add(subDTO);
        }
        System.out.println(subDTOList);
        return new ResponseEntity<>(subDTOList, HttpStatus.OK);
    }
}

