package com.beta.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {
	@RequestMapping("/")
    Person home() {
        return new Person("Hello World!");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}

class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
