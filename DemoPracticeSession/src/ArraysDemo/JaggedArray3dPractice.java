package ArraysDemo;

import java.util.Scanner;

public class JaggedArray3dPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] arr = new int[2][][];
		arr[0] = new int[3][];
		arr[1] = new int[2][];
		arr[0][0] = new int[1];
		arr[0][1] = new int[2];
		arr[0][2] = new int[1];
		arr[1][0] = new int[3];
		arr[1][1] = new int[4];
		// Array Initialization
		System.out.println("Enter the index values =");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(" Elements are = " + arr[i][j][k]);
				}
			}
		}
	}
}