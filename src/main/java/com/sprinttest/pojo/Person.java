package com.sprinttest.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Person implements BeanPostProcessor {

	private Long adharCardNumber;
	private String personName;
	private Address residentialAddress;
	private Address permanentAddress;

	public Person() {

	}

	public Person(Long adharCardNumber, String personName, Address residentialAddress, Address permanentAddress) {
		super();
		this.adharCardNumber = adharCardNumber;
		this.personName = personName;
		this.residentialAddress = residentialAddress;
		this.permanentAddress = permanentAddress;
	}

	public Long getAdharCardNumber() {
		return adharCardNumber;
	}

	public void setAdharCardNumber(Long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Everything is destroyed");
	}

}
