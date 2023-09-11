package com.kn.elseifladder;
import java.util.Scanner;
public class StudentsGrade {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int numStudents = scanner.nextInt();
    int[] scores = new int[numStudents];
    char[] grades = new char[numStudents];

		 for (int i = 0; i < numStudents; i++) {
		            System.out.print("Enter the score for student " + (i + 1) + ": ");
		            scores[i] = scanner.nextInt();
		            grades[i] = calculateGrade(scores[i]);
		        }

		        System.out.println("\nStudent Grades:");

		        for (int i = 0; i < numStudents; i++) {
		            System.out.println("Student " + (i + 1) + " - Score: " + scores[i] + ", Grade: " + grades[i]);
		        }

		        scanner.close();
		    }

		    public static char calculateGrade(int score) {
		        if (score >= 90 && score <= 100) {
		            return 'A';
		        } else if (score >= 80 && score <= 89) {
		            return 'B';
		        } else if (score >= 70 && score <= 79) {
		            return 'C';
		        } else if (score >= 60 && score <= 69) {
		            return 'D';
		        } else {
		            return 'F';
		        }
		    }
	}
