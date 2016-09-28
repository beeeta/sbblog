package com.beta.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.beta.repos")
public class MyJpaRepositoryConfiguration {

}
