package com.example.madhu;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(a +" " +b);
		
		  for(int i = 2; i < n; i++) {
	            int c = a + b;
	            System.out.print(c + " ");
	            a = b;
	            b = c;
	        }	sc.close();
	}

}
