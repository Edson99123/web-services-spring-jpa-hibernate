package com.delivery.webservicejpa.repositories;

import com.delivery.webservicejpa.entities.OrderItem;
import com.delivery.webservicejpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
