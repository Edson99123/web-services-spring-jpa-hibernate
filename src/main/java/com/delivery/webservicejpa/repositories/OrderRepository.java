package com.delivery.webservicejpa.repositories;

import com.delivery.webservicejpa.entities.Order;
import com.delivery.webservicejpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends  JpaRepository<Order, Long>{
	

}
