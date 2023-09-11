package Com.kn.Arrays;

import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Array Declaration
		int[][][] arr;
		// Array Creation
		System.out.println("Enter the size of Array = ");
		int size1 = sc.nextInt();
		System.out.println("Enter the size of Array = ");
		int size2 = sc.nextInt();
		System.out.println("Enter the size of Array = ");
		int size3 = sc.nextInt();
		arr = new int[size1][size2][size3];
		// Array Initilization
		System.out.println("Enter the index values = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		// Array Traversing
		System.out.println("Array Elements are as follows :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k] + " ");
				}
			}
		}

	}

}
