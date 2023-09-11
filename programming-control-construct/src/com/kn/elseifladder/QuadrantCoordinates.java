package com.kn.elseifladder;
import java.util.Scanner;
public class QuadrantCoordinates {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the x-coordinate of the point: ");
		        double x = scanner.nextDouble();
		        System.out.print("Enter the y-coordinate of the point: ");
		        double y = scanner.nextDouble();
		        String quadrant = identifyQuadrant(x, y);
		        System.out.println("The point lies in quadrant " + quadrant);

		        scanner.close();
		    }

		    static String identifyQuadrant(double x, double y) {
		        if (x > 0 && y > 0) {
		            return "I";
		        } else if (x < 0 && y > 0) {
		            return "II";
		        } else if (x < 0 && y < 0) {
		            return "III";
		        } else if (x > 0 && y < 0) {
		            return "IV";
		        } else {
		            return "on the origin or on an axis";
		        }
		    }
	}
