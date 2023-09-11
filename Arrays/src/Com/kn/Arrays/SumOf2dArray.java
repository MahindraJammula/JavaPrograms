package Com.kn.Arrays;

import java.util.Scanner;

public class SumOf2dArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Array Declaration and Creation
		int[][] arr = new int[2][5];
		int[][] brr = new int[arr.length][arr[0].length];

		// Array Initilization
		System.out.println("Enter the FIrst Array Elements = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the Second Array elements = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Sum of Array Elements = ");
		findsumofelements(arr, brr);
	}

	// Method to find sum of elements in array
	public static void findsumofelements(int[][] arr, int[][] brr) {
		int[][] crr = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
				System.out.println(crr[i][j] + " ");

			}
		}
	}
}
