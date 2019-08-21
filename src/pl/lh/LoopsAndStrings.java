package pl.lh;

import java.io.*;
import java.util.*;

public class LoopsAndStrings {

    public static void main(String[] args) {

        System.out.println("Program will print 'even' and 'odd' letters separately. " +
                "\n Please enter how many words do You want to enter, remember, that You can enter between 1 to 10 words: ");

        Scanner scan = new Scanner(System.in);

        int Cycles = scan.nextInt();
        scan.nextLine();
        if (Cycles >= 1 && Cycles <= 10)
        {
            for (int a = 1; a <= Cycles; a++) {
                System.out.println("Pleas enter word: ");
                String inputString = scan.nextLine();
                System.out.println("Your modified word: ");
                char[] stringToCharArray = inputString.toCharArray();

                for (int i = 0; i < inputString.length(); i = i + 2) {
                    System.out.print(stringToCharArray[i]);
                }
                System.out.print(" ");
                for (int i = 1; i < inputString.length(); i = i + 2) {
                    System.out.print(stringToCharArray[i]);
                }

                System.out.println();
            }
        }else {
            System.out.println("Number of Cycles must be between 1 and 10... ");
        }
        scan.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}