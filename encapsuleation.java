package com.Opps.madhu;

class Person {
	private String name;
	private int age;

	public String getname() {
		return name;
	}
	
	// Error: Missing parameter for setName method
	public void setname(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	// Error: Return type should be void, not int
	// Error: Missing parameter for setAge method
	public void setAge(int age) {
		this.age = age;
	}
}

public class Encapsulationn1 {
	public static void main(String[] args) {
		Person personobj = new Person();
		
		// Error: Incorrect syntax for calling the setName method
		personobj.setname("Madhu");
		
		// Error: Incorrect syntax for calling the setAge method
		personobj.setAge(10);
		
		// Error: Incorrect method call in print statement
		System.out.println(personobj.getname() + personobj.getAge());
	}
}
