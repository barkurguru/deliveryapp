package com.xebia.deliveryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.deliveryapp.entity.DeliverBoyDetails;
import com.xebia.deliveryapp.service.DeliveryBoyInfoService;

@RestController
@RequestMapping(value="/delivery")
public class DeliveryBoyInfoController {

	@Autowired
	DeliveryBoyInfoService dBoyService;
	
	@GetMapping(value="/memberdetails")
    public ResponseEntity<Page<DeliverBoyDetails>> getDeliveryBoyDetails(Pageable page) {
        Page<DeliverBoyDetails> list = dBoyService.getDeliveryBoyDetails(page);
        return new ResponseEntity<Page<DeliverBoyDetails>>(list, new HttpHeaders(), HttpStatus.OK);
    }	

	
	
	
}
