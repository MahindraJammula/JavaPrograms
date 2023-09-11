package com.kn.simpleif;

import java.util.Scanner;

public class CaptialLetter {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the Letter");
	        char ch =sc.next().charAt(0); // You can change this character to test different values

	        if (ch >= 'A' && ch <= 'Z') {
	            System.out.println("Capital Letter");
	        }
	    }
	}



