package pl.lh;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int para = 0;
        for (int i=0; i<n;i++){
            for (int j=i+1; j<n;j++){
                if(ar[j]==ar[i] && ar[j] != 0){
                    para++;
                    ar[j]=0;
                    break;
                }

            }
        }
        return para;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int ar[] = {2,3,4,2,1,2,5,3,2};
        int n = ar.length;
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}