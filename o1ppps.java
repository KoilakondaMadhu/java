package com.example.madhu;
class Pen{
	String color;
	String type;
	public void write() {
		System.out.println("Writing something");
	}
	public void printColor() {
		System.out.println(this.color); // this is a key word to tell which called this funtion
	}
}


public class Opps {
		public static void main(String[] args) {
			Pen pen1 = new Pen();
			//type is classname  obj = new from PEN class
			pen1.color = "blue";
			pen1.type = "gel";  // properties are used with  " . "
			
			//pen1.write();    // to call we use . again
			
			
			Pen pen2 = new Pen();
			pen2.color = "black";
			pen2.type = "ballpoint";
			
			//pen2.write();
			pen1.printColor();
			pen2.printColor();
			
		}

}
