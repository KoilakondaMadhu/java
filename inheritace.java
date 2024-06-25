package com.example.madhu;
import java.util. *;
class Shape {
    

    public void displayShape() {
        System.out.println("Shape class");
    }
}

class Rectangle extends Shape {
    public void displayRectangle() {
        System.out.println("dr");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Corrected the instantiation and method call
        Rectangle r1 = new Rectangle();
        r1.displayShape();      // Calls the displayShape method from Shape class
        r1.displayRectangle();  // Calls the displayRectangle method from Rectangle class
    }
}
