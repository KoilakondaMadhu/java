5
*****
****
***
**
*

package com.example.madhu;

import java.util.Scanner;

public class ReverseTriangel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for (int i =1; i<= row; i++) {
			for (int j = i ; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
