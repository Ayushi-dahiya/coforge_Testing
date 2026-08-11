package com.hdfcBank.register;

public class mainhdfc {
	 public static void main(String[] args) {

	        demogetvariable obj = new demogetvariable();

	        // Set values
	        obj.setAge(21);
	        obj.setSalary(25000.50f);
	        obj.setGender('F');
	        obj.setName("Ayushi");

	        // Get values
	        System.out.println("Age: " + obj.getAge());
	        System.out.println("Salary: " + obj.getSalary());
	        System.out.println("Gender: " + obj.getGender());
	        System.out.println("Name: " + obj.getName());
	    }
}
