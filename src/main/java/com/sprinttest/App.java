package com.sprinttest;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sprinttest.pojo.Address;
import com.sprinttest.pojo.Country;
import com.sprinttest.pojo.Employee;
import com.sprinttest.pojo.HelloWorld;
import com.sprinttest.pojo.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Address address1 = (Address) context.getBean("addressBean1");
		System.out.println(address1);
		Address address3 = (Address) context.getBean("addressBean1");
		System.out.println(address3);
		Address address2 = (Address) context.getBean("addressBean2");
		System.out.println(address2);
		Address address4 = (Address) context.getBean("addressBean2");
		System.out.println(address4);
		Person person = (Person) context.getBean("personBean");
		System.out.println(person.getAdharCardNumber());
		System.out.println(person.getPersonName());
		
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
		helloWorld.printMessage();
		
		Country countryBean = (Country) context.getBean("countryBean");
		System.out.println(countryBean.getListOfCountries());
		Map mapOfCountries = countryBean.getMapOfCountries();
		mapOfCountries.put("1", "US");
		System.out.println(countryBean.getMapOfCountries());
		
		Employee emp = (Employee) context.getBean("employeeBean");
		System.out.println(emp.getDepartment());
	
		((AbstractApplicationContext) context).close();
	}
}
