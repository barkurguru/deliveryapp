package com.xebia.deliveryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xebia.deliveryapp.entity.DeliverBoyDetails;
import com.xebia.deliveryapp.repository.DeliveryBoyInfoRepository;

@Service
public class DeliveryBoyInfoService {

	@Autowired
	DeliveryBoyInfoRepository repository;
	
    public Page<DeliverBoyDetails> getDeliveryBoyDetails(Pageable page)
    {
        Page<DeliverBoyDetails> dBoyList = repository.findAll(page);
         return dBoyList;
    }

}
