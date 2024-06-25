package com.example.madhu;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String original = sc.nextLine();
			
			String reversed = reversedString(original);
			System.out.println("Revered String:" +reversed);
			
	}
	public static String reversedString(String str) {
		String reversed= "";
		for (int i = str.length() - 1; i>= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

}


// asdfg
// Revered String:gfdsa
