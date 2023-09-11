package com.kn.ifelse;

import java.util.Scanner;

public class SeniorCitizenDiscount {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the age = ");
	        int age = sc.nextInt(); // You can change this age to test different values

	        if (age >= 60) {
	            System.out.println("Eligible for senior citizen discount");
	        } else {
	            System.out.println("Not eligible for senior citizen discount");
	        }
	    }
	}
