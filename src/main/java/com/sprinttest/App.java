package com.sprinttest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sprinttest.config.HelloWorldConfig;
import com.sprinttest.config.HelloWorldConfig2;
import com.sprinttest.pojo.HelloWorld;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("application-context.xml");

		// Initialize java based configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(HelloWorldConfig.class);
		context.register(HelloWorldConfig2.class);
		context.refresh();
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
		helloWorld.printMessage();
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloBean2");
		helloWorld2.printMessage();
		/*
		 * Address address1 = (Address) context.getBean("addressBean1");
		 * System.out.println(address1); Address address3 = (Address)
		 * context.getBean("addressBean1"); System.out.println(address3); Address
		 * address2 = (Address) context.getBean("addressBean2");
		 * System.out.println(address2); Address address4 = (Address)
		 * context.getBean("addressBean2"); System.out.println(address4); Person person
		 * = (Person) context.getBean("personBean");
		 * System.out.println(person.getAdharCardNumber());
		 * System.out.println(person.getPersonName());
		 * 
		 * HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
		 * helloWorld.printMessage();
		 * 
		 * Country countryBean = (Country) context.getBean("countryBean");
		 * System.out.println(countryBean.getListOfCountries()); Map mapOfCountries =
		 * countryBean.getMapOfCountries(); mapOfCountries.put("1", "US");
		 * System.out.println(countryBean.getMapOfCountries());
		 */

//		Department dpt = (Department) context.getBean("departmentBean");
//		System.out.println(dpt);
//		Department dpt2 = (Department) context.getBean("departmentBean");
//		System.out.println(dpt2);
		/*
		 * Employee emp = (Employee) context.getBean("employeeBean");
		 * System.out.println("Department from employee: " + emp.getDepartment());
		 */
		((AbstractApplicationContext) context).close();
	}
}
