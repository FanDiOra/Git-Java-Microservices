package com.esmt.m223isi.microservicies.userauthentificationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esmt.m223isi.microservicies.userauthentificationservice.bean.User;

public interface UserRepository 
	extends JpaRepository<User, Long>{
		
	User findByLoginAndPassword (String login, String password);

}
