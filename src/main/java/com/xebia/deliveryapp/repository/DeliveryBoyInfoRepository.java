package com.xebia.deliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xebia.deliveryapp.entity.DeliverBoyDetails;

@Repository
public interface DeliveryBoyInfoRepository extends JpaRepository<DeliverBoyDetails, Integer> {

}
