package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class LoginModel {
	public String email;
	public String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
