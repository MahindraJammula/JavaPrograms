package Com.kn.Arrays;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Array Declaration and Creation
		System.out.println("Enter the Size of Length = ");
		int[] arr = new int[sc.nextInt()];
		// Array Initiliazation
		System.out.println("Enter the elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter key value = ");
		int k = sc.nextInt();
		k = k % arr.length;
		for (int i = 1; i <= k; i++) {
			rotate(arr);

		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	static void rotate(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;

	}

}
