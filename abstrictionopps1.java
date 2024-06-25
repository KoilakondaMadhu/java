package com.Opps.madhu;


abstract class Animal{
	abstract void makeSound();
	
	void eat() {
		System.out.println("This animal eats food");
	}
}


class Dog extends Animal{
	void makeSound() {
		System.out.println("Woof");
	}
}
public class AbstractionOpps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dogobj = new Dog();
		dogobj.makeSound();
		dogobj.eat();

	}

}

// Woof
// This animal eats food

