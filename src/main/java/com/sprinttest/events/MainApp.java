package com.sprinttest.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sprinttest.pojo.HelloWorld;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
// raise a start event.
		context.start();
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printMessage();
// raise a stop event.
		context.stop();

		CustomSpringEventPublisher cvp = (CustomSpringEventPublisher) context.getBean("customEventPublisher");
		cvp.doStuffAndPublishAnEvent("Hello");
	}
}
