package com.delivery.webservicejpa.repositories;

import com.delivery.webservicejpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
