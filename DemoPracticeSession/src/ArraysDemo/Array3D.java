package ArraysDemo;

import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array 1= ");
		long[] arr = new long[sc.nextInt()];
		System.out.println("Enter the size of Array 2 = ");
		long[] brr = new long[sc.nextInt()];
		System.out.println("Enter the size of Array 2 = ");
		long[] crr = new long[sc.nextInt()];
		System.out.println("Enter the Elements of array 1 = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		System.out.println("Enter the Elements of array 2 = ");
		for (int j = 0; j < arr.length; j++) {
			brr[j] = sc.nextLong();
		}
		System.out.println("Enter the Elements of array 2 = ");
		for (int k = 0; k < arr.length; k++) {
			crr[k] = sc.nextLong();
		}
	}

}
