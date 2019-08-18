package pl.lh;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ConditionalStatements {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program sprawdza liczbę i podaje wynik: \n" +
                "-'Weird' jeśli liczba jest nieparzysta oraz w przedziale domkniętym od 6 do 20 \n" +
                "-'Not Weird' jeśli liczba jest parzysta oraz w przedziale domkniętym od 2 do 5 oraz większe od 20 \n" +
                "Liczba musi być większa bądź równa 1 oraz mniejsza bądź równa 100 \n" +
                "Podaj liczbę: ");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N >= 1 && N <= 100) {
            if (N % 2 != 0 || N >= 6 && N <= 20) {
                System.out.println("\nPodana liczba " + N + " jest: Weird");
            } else
                System.out.println("\nPodana liczba " + N + " jest: Not Weird");
        }

        scanner.close();
    }
}
