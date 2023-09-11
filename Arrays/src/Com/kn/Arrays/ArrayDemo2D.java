package Com.kn.Arrays;

import java.util.Scanner;

public class ArrayDemo2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Array Declaration
		int[][] arr;
   
		// Array Creation
		System.out.println("Enter number of students = ");
		int size1 = sc.nextInt();
		System.out.println("Enter number of subjects per student = ");
		int size2 = sc.nextInt();
		arr = new int[size1][size2];

		// Array Initilization
		for (int i = 0; i < size1; i++) {
			System.out.println("Enter student " + (i + 1) + " Data :");
			for (int j = 0; j < size2; j++) {
				System.out.println("Enter student " + (j + 1) + "Marks = ");
				arr[i][j] =sc.nextInt();
			}
		}
		System.out.println("****************************************************");
		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Student" + (i + 1) + " Data : ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Subject " + (j + 1) + " Marks " + arr[i][j]);
			}
		}
	}
}
