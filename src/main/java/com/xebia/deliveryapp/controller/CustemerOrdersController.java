package com.xebia.deliveryapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.deliveryapp.entity.OrderDetails;
import com.xebia.deliveryapp.service.CustomerOrderService;

@RestController
@RequestMapping(value="/orders")
public class CustemerOrdersController {

	@Autowired
	CustomerOrderService custService;
	
	@GetMapping(value="/getAllOrders")
    public ResponseEntity<Page<OrderDetails>> getAllOrders(Pageable page) {
        Page<OrderDetails> list = custService.getAllOrders(page);
        return new ResponseEntity<Page<OrderDetails>>(list, new HttpHeaders(), HttpStatus.OK);
    }	

//	@GetMapping(value="/getOrderNum/{id}")
//    public ResponseEntity<Optional<OrderDetails>> getOrderNumber(@RequestParam("id") int id) {
//        Optional<OrderDetails> orderbyId = custService.getOrderNumber(id);
//        return new ResponseEntity<OrderDetails>(HttpStatus.OK).ok(orderbyId);
//    }
	
	
}
