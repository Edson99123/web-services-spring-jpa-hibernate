package com.delivery.webservicejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.webservicejpa.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	

}
