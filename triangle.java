4

*
**
***
****

package com.example.madhu;
import java.util.Scanner;
public class tringle {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		for(int i = 0;i <= size; i++) {
			
			for (int j = 0 ; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
