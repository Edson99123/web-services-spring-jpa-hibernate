package com.delivery.webservicejpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.webservicejpa.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User e = new User(2L, "Edson", "edson@gmail.com", "(68)987989999", "321654");
		return ResponseEntity.ok().body(e);
	}

}
