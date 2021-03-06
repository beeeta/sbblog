package com.beta.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 用户信息
 * @author beta
 */
@Entity
public class BgUser {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String username;
	private String password;
	
	public BgUser(){};
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
