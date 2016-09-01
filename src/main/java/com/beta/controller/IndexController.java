package com.beta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beta.service.BlogFileService;


@Controller
public class IndexController {
	
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
	
}
