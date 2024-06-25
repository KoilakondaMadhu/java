package com.example.madhu;

import java.util.Arrays;

public class Stringsplit {
    public static void main(String[] args) {
        // Declaring and initializing a string
        String str = "Converting string to,string array using String[]";   
// [Converting, string, to,string, array, using, String[]]

        
        // Splitting the string into an array of words using space as the delimiter
        String[] strArray = str.split(", ");
        String [] str2 = str.split(" ");
        // Printing the string array using Arrays.toString()
        System.out.println(Arrays.toString(str2));
    }
}

