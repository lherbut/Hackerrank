package pl.lh;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program will inverse Your array." +
                "\n Please enter array length: ");
        int n = scanner.nextInt();
        scanner.skip("(\n|[\n\u2028\u2029\u0085])?");
        System.out.println("Please enter in line with spaces Your digits: ");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
                        }
        System.out.println("Your reversed array: ");
        for (int j = n-1; j >= 0; j--){
            System.out.print(arr[j] + " ");
        }


        scanner.close();
    }
}
