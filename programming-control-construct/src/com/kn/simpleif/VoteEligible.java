package com.kn.simpleif;

import java.util.Scanner;

public class VoteEligible {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the Age = ");
	        int age =sc.nextInt(); // You can change this age to test different values

	        if (age >= 18) {
	            System.out.println("Vote Eligible");
	        }
	    }
	}

