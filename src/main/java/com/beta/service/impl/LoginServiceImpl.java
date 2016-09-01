package com.beta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beta.repos.LoginDao;
import com.beta.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;
	
	public void setLoginUserDao(LoginDao loginUserDao){
		this.loginDao = loginUserDao;
	}
}
