package com.beta.repos;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.beta.entity.BgUser;


@Repository
public interface LoginDao extends PagingAndSortingRepository<BgUser, Long>{
	public List<BgUser> findAll();
}
