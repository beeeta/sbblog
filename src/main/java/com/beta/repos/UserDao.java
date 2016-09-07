package com.beta.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beta.entity.BgUser;


@Repository
public interface UserDao extends JpaRepository<BgUser, Long>{

	public BgUser findByUsername(String username);
	//可自定义查询方法，根据方法名称定义查询语句
	
	
}
