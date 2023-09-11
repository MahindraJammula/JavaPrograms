package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number = ");
        int number=sc.nextInt(); // You can change this number to test different values

        if (number > 0) {
            System.out.println("Positive Number");
        }
    }
}
