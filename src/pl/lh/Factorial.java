package pl.lh;

import java.util.*;

public class Factorial {

    public static int factorial(int n){
        return (n > 1) ? n * factorial(n - 1) : 1;
    }
    
    public static void main(String[] args) {
        System.out.print("Please enter Your number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.print("Factorial of Your number is: ");
        System.out.println(factorial(n));
    }
}