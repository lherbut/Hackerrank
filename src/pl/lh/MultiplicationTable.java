package pl.lh;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MultiplicationTable {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program count multiplication table from 1 to 10 for choosen number" +
                "\n Please enter Your number:  ");
        int n = scanner.nextInt();
        int result;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i<=10; i++){
           result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
