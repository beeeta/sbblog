package com.beta.controller;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by beta on 2016/9/28.
 */
@ControllerAdvice(basePackages = "com.beta.controller")
public class ExceptionHandler extends WebMvcConfigurerAdapter{
}
