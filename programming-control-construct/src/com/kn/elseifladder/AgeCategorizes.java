package com.kn.elseifladder;
import java.util.Scanner;

public class AgeCategorizes {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();
		        
		        if (age >= 0 && age <= 12) {
		            System.out.println("Child");
		        } else if (age >= 13 && age <= 19) {
		            System.out.println("Teen");
		        } else if (age >= 20 && age <= 59) {
		            System.out.println("Adult");
		        } else {
		            System.out.println("Senior");
		        }
		    }
	}
