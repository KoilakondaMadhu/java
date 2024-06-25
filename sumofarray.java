package com.example.madhu;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		int sum = 0;
		System.out.println("enter array");
		for (int i  = 0; i< size; i++) {
			arr[i] = scan.nextInt();
			
		}
		for (int i = 0; i< size; i++) {
			sum += arr[i];
			
		}
		
		System.out.println(sum);
	}
}


// enter size
// 3
// enter array
// 4
// 3
// 2
// 9
