package pl.lh;

import java.util.*;
import java.io.*;

class Phonebooks {
    public static void main(String []argh){

        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter how many people Your phonebook will store: ");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Please enter name: ");
            String name = scan.next();
            System.out.print("Please enter phone number: ");
            int phone = scan.nextInt();
            phoneBook.put(name, phone);
        }
        System.out.print("Please enter name for which You look for phone number: ");
        while(scan.hasNext()){
            String s = scan.next();
            Integer phoneNumber = phoneBook.get(s);
            System.out.println(
                    (phoneNumber != null)
                            ? s + " = " + phoneNumber
                            : "This contact is not found"
            );
        }
        scan.close();
    }
}