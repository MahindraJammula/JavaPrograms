package com.kn.ifelse;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Numbers = ");
		        int grade =sc.nextInt(); // You can change this grade to test different values

		        if (grade > 50) {
		            System.out.println("Pass");
		        } else {
		            System.out.println("Fail");
		        }
		    }
		}

