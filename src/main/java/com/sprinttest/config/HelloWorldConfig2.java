package com.sprinttest.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sprinttest.pojo.Address;
import com.sprinttest.pojo.Person;

@Configuration
public class HelloWorldConfig2 {
	
	@Autowired
	@Qualifier("address1")
	public Address adress1;
	@Autowired
	@Qualifier("address2")
	public Address adress2;
	
	@Bean(name="listAddresses") 
	public List<Address> listAddresses() {
		List<Address> list = new ArrayList<>();
		list.add(new Address());
		return list;
	}
	
	@Bean(name="person")
	public Person person() {
		return new Person(1L, "ABC", adress1, adress2, listAddresses());
	}
}