package com.beta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beta.service.LoginService;


@Controller
public class BaseController {
	
	@Autowired
	private LoginService loginService;
	/**
	 * 管理用户登录接口
	 */
	@RequestMapping(path="/listUsers")
	public String listUsers(Model model){
		model.addAttribute("users", loginService.listUsers());
		return "index";
	}
	
}
