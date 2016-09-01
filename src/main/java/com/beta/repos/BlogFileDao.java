package com.beta.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.beta.entity.BgFile;

@Repository
public interface BlogFileDao extends PagingAndSortingRepository<BgFile, Long>{
	
}
