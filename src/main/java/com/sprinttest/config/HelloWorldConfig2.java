package com.sprinttest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sprinttest.pojo.HelloWorld;

@Configuration
public class HelloWorldConfig2 {
	@Bean(name="helloBean2")
	public HelloWorld helloWorld() {
		return new HelloWorld("Hi", "Worlds");
	}
}