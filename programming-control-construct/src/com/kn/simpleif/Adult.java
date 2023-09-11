package com.kn.simpleif;

import java.util.Scanner;

public class Adult {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a age = ");
        int age = sc.nextInt(); // You can change this age to test different values

        if (age > 21) {
            System.out.println("Adult");
        }
    }
}

