package com.beta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beta.repos.UserDao;
import com.beta.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	private UserDao userDao;
	
	@Autowired
	public void setLoginUserDao(UserDao userDao){
		this.userDao = userDao;
	}
}
