package com.sprinttest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sprinttest.pojo.Address;
import com.sprinttest.pojo.HelloWorld;

@Configuration
public class HelloWorldConfig {
	@Bean(name="helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorld("Hi", "World");
	}
	
	@Bean(name="address1") 
	public Address adress1() {
		return new Address();
	}
	@Bean(name="address2") 
	public Address adress2() {
		return new Address();
	}
}