package com.kn.elseifladder;

	import java.util.Scanner;

	public class Characters {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0);

	        if (Character.isLowerCase(ch)) {
	            if (isVowel(ch)) {
	                System.out.println("Lower-case vowel");
	            } else {
	                System.out.println("Lower-case consonant");
	            }
	        } else if (Character.isUpperCase(ch)) {
	            if (isVowel(ch)) {
	                System.out.println("Upper-case vowel");
	            } else {
	                System.out.println("Upper-case consonant");
	            }
	        } else if (Character.isDigit(ch)) {
	            System.out.println("Digit");
	        } else {
	            System.out.println("Special character");
	        }
	    }

	     static boolean isVowel(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}



