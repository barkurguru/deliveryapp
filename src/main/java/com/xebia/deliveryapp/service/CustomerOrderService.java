package com.xebia.deliveryapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xebia.deliveryapp.entity.OrderDetails;
import com.xebia.deliveryapp.repository.CustomerOrderRepository;

@Service
public class CustomerOrderService {

	@Autowired
	CustomerOrderRepository repository;
	
    public Page<OrderDetails> getAllOrders(Pageable page)
    {
        Page<OrderDetails> orderList = repository.findAll(page);
         return orderList;
    }

	public Optional<OrderDetails> getOrderNumber(int id) {
		Optional<OrderDetails> oId=repository.findById(id);
		return oId;
	}

}
