package com.esmt.m223isi.microservicies.userauthentificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.esmt.m223isi.microservicies.userauthentificationservice.bean.User;
import com.esmt.m223isi.microservicies.userauthentificationservice.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	//@Autowired
	//private Environment environment;
	
	@GetMapping("/user-authentification/login/{login}/password/{password}")
	public User getUser (
			@PathVariable String login, @PathVariable String password) {
		User user = repository.findByLoginAndPassword(login, password);
		
		//String port = environment.getProperty("local.server.port");
		
		if(user == null)
			throw new RuntimeException("Utilisateur non trouvé!!!!!");
		//user.setEnvironnement(port);
		return user;
	}
}
