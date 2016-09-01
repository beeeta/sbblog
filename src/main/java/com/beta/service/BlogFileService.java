package com.beta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beta.repos.BlogFileDao;

@Service
public class BlogFileService {
	
	@Autowired
	private BlogFileDao blogFileDao;
	
	
}
