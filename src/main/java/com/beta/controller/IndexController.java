package com.beta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beta.entity.BgUser;
import com.beta.service.BlogFileService;


@Controller
public class IndexController{

	@Autowired
	private Environment environment;

	private BlogFileService blogFileService;

	@Autowired
	public void setBlogFileService(BlogFileService blogFileService) {
		this.blogFileService = blogFileService;
	}
	
	/**
	 * 管理用户登录接口
	 */
	@RequestMapping(path="/")
	public String listUsers(Model model){
		model.addAttribute("blogs", blogFileService.listBgFiles());
		return "index";
	}
	
	/**
	 * 管理员登录页面
	 */
	@RequestMapping(path="/login",method=RequestMethod.GET)
	public String loginPage(){
		return "log/login";
	}
	
//	/**
//	 * 管理员登录请求
//	 */
//	@RequestMapping(path="/login",method=RequestMethod.POST)
//	static String login(BgUser user,Model model){
//		if("allen".equals(user.getUsername())&&"beta".equals(user.getPassword())){
//			return "manage/manage";
//		}
//		model.addAttribute("msg"," account or password error");
//		return "log/login";
//	}
//
	@RequestMapping(path="/manage",method=RequestMethod.GET)
	public String manage(Model model){
		model.addAttribute("blogs", blogFileService.listBgFiles());
		return "manage/manage";
	}

}
