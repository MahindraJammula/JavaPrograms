package ArraysDemo;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array = ");
		int[] arr = new int[sc.nextInt()];
		// Initialize array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the Elements " + (i + 1) + " = ");
			arr[i] = sc.nextInt();
		}
		// k determine the number of times an array should be rotated.
		System.out.println("Enter the k times value = ");
		int n = sc.nextInt();

		// Displays original array
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Rotate the given array by n times toward right
		for (int i = 0; i < n; i++) {
			// int j, last;
			int j, first;
			// Stores the last element of array
			// last = arr[arr.length - 1];
			first = arr[0];
			// for (j = arr.length - 1; j > 0; j--)//right rotate
			for (j = 0; j < arr.length - 1; j++) // left rotate
			{
				// Shift element of array by one
				arr[j] = arr[j + 1];//right rotate
				//arr[j] = arr[j - 1];//left rotate
			}
			// Last element of array will be added to the start of array.
			arr[j] = first;//left rotate
			//arr[0] = last;//right rotate
		}

		System.out.println();

		// Displays resulting array after rotation
		System.out.println("Array after right rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
