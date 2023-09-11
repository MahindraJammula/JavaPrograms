package com.kn.elseifladder;
import java.util.Scanner;
 public class ZodiacSign {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your date of birth (in format DD/MM): ");
	        String dateOfBirth = scanner.nextLine();
	        int day = Integer.parseInt(dateOfBirth.split("/")[0]);
	        int month = Integer.parseInt(dateOfBirth.split("/")[1]);
	        String zodiacSign = identifyZodiacSign(day, month);
	        System.out.println("Your zodiac sign is: " + zodiacSign);

	        scanner.close();
	    }

	    static String identifyZodiacSign(int day, int month) {
	        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
	            return "Aries";
	        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
	            return "Taurus";
	        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
	            return "Gemini";
	        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
	            return "Cancer";
	        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
	            return "Leo";
	        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
	            return "Virgo";
	        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
	            return "Libra";
	        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
	            return "Scorpio";
	        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
	            return "Sagittarius";
	        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
	            return "Capricorn";
	        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
	            return "Aquarius";
	        } else {
	            return "Pisces";
	        }
	    }
	}


	


