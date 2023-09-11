package Com.kn.Arrays;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the size of Array = ");
		int arr[] = new int[sc.nextInt()];
		int brr[] = new int[arr.length];
		int crr[] = new int[arr.length];

		// Array Initilization
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter Element " + (i + 1) + " Array 1 ");
			arr[i] = sc.nextInt();
		}
			for (int j = 0; j < arr.length; j++) 
			{
				System.out.println("Enter Element " + (j + 1) + " Array 2 ");
				brr[j] = sc.nextInt();
			}
			arraysum(arr, brr);
			product(arr, brr);
			sc.close();
			
		}

	public static void product(int[] arr, int[] brr) {
		int[] crr = new int[arr.length];
		System.out.println("Product of Array Elements = ");
		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i] * brr[i];
			System.out.println(" " + crr[i]);
		}

	}
	
	// Method to find Array sum
	public static void arraysum(int[] arr, int[] brr) {
		int[] crr = new int[arr.length];
		System.out.println("Sum of Array Elements : ");
		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i] + brr[i];
			System.out.println(" " + crr[i]);
		}

	}
}
