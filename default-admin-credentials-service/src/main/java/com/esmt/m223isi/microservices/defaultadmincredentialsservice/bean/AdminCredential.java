package com.esmt.m223isi.microservices.defaultadmincredentialsservice.bean;

public class AdminCredential {
	private String login;
	private String password;
	
	public AdminCredential() {
		// TODO Auto-generated constructor stub
	}

	public AdminCredential(String login, String password) {
		super();
		this.login = login;
		this.password = password;
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
