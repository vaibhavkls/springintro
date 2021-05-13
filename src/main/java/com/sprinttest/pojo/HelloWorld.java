package com.sprinttest.pojo;

public class HelloWorld {
	
	private String greeting;
	private String message;
	
	public HelloWorld(String greeting, String message) {
		this.greeting = greeting;
		this.message = message;
	}

	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println(this.greeting + " " + this.message);
	}

}
