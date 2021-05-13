package com.sprinttest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sprinttest.pojo.HelloWorld;

@Configuration
public class HelloWorldConfig {
	@Bean(name="helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorld("Hi", "World");
	}
}