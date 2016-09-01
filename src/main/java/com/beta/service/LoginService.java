package com.beta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beta.entity.BgUser;
import com.beta.repos.LoginUserDao;

@Service
public class LoginService {
	
	@Autowired
	private LoginUserDao loginUserDao;
	
	public List<BgUser> listUsers(){
		return loginUserDao.findAll();
	}
}
