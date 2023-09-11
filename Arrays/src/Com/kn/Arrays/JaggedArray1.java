package Com.kn.Arrays;

import java.util.Scanner;

public class JaggedArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the number of students");
		int[][] arr = new int[sc.nextInt()][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the no of students marks " + (i + 1) + " : ");
			arr[i] = new int[sc.nextInt()];
		}

		// Array Initilization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the student " + (i + 1) + " data : ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the student " + (j + 1) + " marks = ");
				arr[i][j] = sc.nextInt();
			}
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Student " + (i + 1) + " data : ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(" subject " + (j + 1) + " marks " + arr[i][j]);
			}
		}
	}
}
