package com.beta.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.beta.entity.BgUser;
import com.beta.repos.UserDao;

public class MyUserDetailsService implements UserDetailsService{
	
	private UserDao userDao;
	
	@Autowired
	public void setDataSource(UserDao userDao){
		this.userDao = userDao;
	}
	
	/**
	 * 给某一个用户分配一组角色
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		BgUser user = userDao.findByUsername(username);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		return new User(user.getUsername(), user.getPassword(), authorities);
	}

}
