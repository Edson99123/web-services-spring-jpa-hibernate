package com.delivery.webservicejpa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.delivery.webservicejpa.entities.User;
import com.delivery.webservicejpa.repositories.UserRepository;

/**
 * Classe de config da aplicação
 * Usanda para aplicar os testes*/
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	
	}
}
