package pl.lh;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Binary {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("The program counts how many 1's in a row are in a binary representation of a digit. \n" +
                "Please enter a digit: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int binary[] = new int[40];
        int index = 0;
        int counter1 = 0;
        int highestStack = 0;

                while(n > 0){
            binary[index++] = n%2;
            n = n/2;
        }
        System.out.println("Binary representation of Your digit: ");
        for(int i = index-1;i >= 0;i--){

            if (binary[i] == 1){
                counter1= counter1+1;
               } else counter1 = 0;
            if (counter1 > highestStack){
                highestStack = counter1;
            }
           System.out.print(binary[i]);

        }
        System.out.println();
        System.out.print("Number of 1's in a row in Your digit: ");
        System.out.println(highestStack);

       scanner.close();
    }
}
