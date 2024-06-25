package com.example.madhu;
import java.util.*;

public class Out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the array
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();

        // Declare the array
        int[] arr = new int[a];

        // Input elements into the array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the elements of the array
        System.out.println("Elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Close the Scanner
        sc.close();
    }
}

// Enter the size of the array: 3
// Enter elements of the array:
// 1
// 2
// 3
// Elements in the array:
// 1
// 2
// 3
