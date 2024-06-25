package com.example.madhu;

import java.util.Scanner;

public class Mirrortriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		
		for (int i = 1 ; i <= rows  ; i++ ) {
			System.out.println();
			for(int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
			
			System.out.print("*");
			}
		}
		
		
			
			sc.close();
		}
	}

