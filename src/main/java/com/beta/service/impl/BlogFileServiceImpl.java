package com.beta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beta.entity.BgFile;
import com.beta.repos.BlogFileDao;
import com.beta.service.BlogFileService;

@Service
public class BlogFileServiceImpl implements BlogFileService{
	
	private BlogFileDao blogFileDao;
	
	@Autowired
	public void setBlogFileDao (BlogFileDao blogFileDao) {
		this.blogFileDao = blogFileDao;
	}
	
	
	public Iterable<BgFile> listBgFiles(){
		return blogFileDao.findAll();
	}
	
}
