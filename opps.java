package com.javaopps;

class Class1 {
    String name;
    int roll;

    // Default constructor
    public Class1() {
        this.name = "Default Name";
        this.roll = 0;
    }

    // Parameterized constructor
    public Class1(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // Another parameterized constructor
    public Class1(String name) {
        this.name = name;
        this.roll = 0; // Default value for roll
    }

    // Method to display the object's details
    public void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

public class Opps {
    public static void main(String[] args) {
        // Using the default constructor
        Class1 obj1 = new Class1();
        obj1.display(); // Output: Name: Default Name, Roll: 0

        // Using the parameterized constructor
        Class1 obj2 = new Class1("John", 123);
        obj2.display(); // Output: Name: John, Roll: 123

        // Using another parameterized constructor
        Class1 obj3 = new Class1("Jane");
        obj3.display(); // Output: Name: Jane, Roll: 0
    }
}
