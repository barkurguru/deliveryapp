package com.xebia.deliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xebia.deliveryapp.entity.OrderDetails;

@Repository
public interface CustomerOrderRepository extends JpaRepository<OrderDetails, Integer> {

}
