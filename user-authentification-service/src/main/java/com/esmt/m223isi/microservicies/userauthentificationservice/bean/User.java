package com.esmt.m223isi.microservicies.userauthentificationservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="utilisateurs")
public class User {
	@Id
	private long id;
	@Column(name="login")
	private String login;
	@Column(name="password")
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
