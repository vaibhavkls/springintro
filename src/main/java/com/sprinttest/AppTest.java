package com.sprinttest;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1,"Vaibhav");
		
		
		/**
		 * The three ways to set the value of the property
		 * 
		 * 1. Constructor - constructor injection
		 * 2. Object and direct access to its properties
		 * 3. Getter / setter
		 */
		student.setStudent_id(2); 
		student.setStudent_name("Vashishtha");
		
		
	}

}
