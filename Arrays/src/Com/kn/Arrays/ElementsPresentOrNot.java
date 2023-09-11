package Com.kn.Arrays;

import java.util.Scanner;

public class ElementsPresentOrNot {
	//Linear Search

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.print("Enter the size of array = ");
		int[] arr = new int[sc.nextInt()];

		// Array Initilization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter integer data for the element " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}
		// Taking element to be found
		System.out.print("Enter the element to be found = ");
		int element = sc.nextInt();

		boolean flag = iselementPresentOrNot(arr, element);
		if (flag) {
			System.out.println("The element " + element + " is found ");
		} else {
			System.out.println("The element " + element + " is not found ");
		}
		sc.close();
	}

	// Method to find the element present or not in array
	public static boolean iselementPresentOrNot(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return true;
			}
		}
		return false;
	}
}
