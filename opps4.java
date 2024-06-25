package com.example.madhu;

class Pen1 {
    String color;
    String type;
    
    public void Penmethod1() {
        System.out.print("penmethod 1");
    }
}

public class Opps1 {
    public static void main(String[] args) {
        Pen1 penobj1 = new Pen1();
        penobj1.Penmethod1();
    }
}
