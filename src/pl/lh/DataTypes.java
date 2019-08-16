package pl.lh;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
	
    public static void main(String[] args) throws IOException {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
       Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        System.out.println("Please type int: ");
        int i2 =scan.nextInt();
        System.out.println("Please type double: ");
        double d2 = scan.nextDouble();
        System.out.println("Please type String: ");
        scan.nextLine();
        String s2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);
        System.out.println(d+ d2);
        System.out.print(s + s2);

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();
    }
}