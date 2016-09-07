package com.beta.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class MySecurityAdapter extends WebSecurityConfigurerAdapter{
	/**
	 * 主要控制用户信息认证
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(getUserDetailService());
	}
	/**
	 * 请求拦截
	 * 主要的请求路径匹配器：antMatchers,regexMatchers
	 * 拦截到请求后，对请求进行权限控制
	 * 指定登录登出页面
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/login").defaultSuccessUrl("/manage")
		.failureUrl("/login?error").permitAll().and().rememberMe().tokenValiditySeconds(10000).key("myKey");
		http.authorizeRequests().antMatchers("/manage/**").hasRole("ADMIN");
	}
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}
	
	@Bean
	public UserDetailsService getUserDetailService(){
		return new MyUserDetailsService();
	}
}
