package com.example.madhu;

import java.util.Scanner;

public class Numbertringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		for (int i = 1; i<= rows; i++) {
			
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

//
//9
//1
//12
//123
//1234
//12345
//123456
//1234567
//12345678
//123456789
