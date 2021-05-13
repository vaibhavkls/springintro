package com.sprinttest.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sprinttest.pojo.Address;
import com.sprinttest.pojo.Person;

@Configuration
public class HelloWorldConfig2 {
	
	@Bean(name="address1") 
	public Address adress1() {
		return new Address();
	}
	@Bean(name="address2") 
	public Address adress2() {
		return new Address();
	}
	
	@Bean(name="listAddresses") 
	public List<Address> listAddresses() {
		List<Address> list = new ArrayList<>();
		list.add(new Address());
		return list;
	}
	
	@Bean(name="person")
	public Person person() {
		return new Person(1L, "ABC", adress1(), adress2(), listAddresses());
	}
}