package com.kn.ifelse;

import java.util.Scanner;

public class PositiveNegativeNumber {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.print("Enter a Number = ");
	        int number =sc.nextInt(); // You can change this number to test different values

	        if (number > 0) {
	            System.out.println("Positive");
	        } else if (number < 0) {
	            System.out.println("Negative");
	        } else {
	            System.out.println("Zero");
	        }
	    }
	}

