package Com.ArrayTasks;

import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Array Declaration & Creation
		System.out.println("Enter the size of Array = ");
		int[] arr = new int[sc.nextInt()];
		// Array Initiliazation
		System.out.println("Enter the elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		getMinMax(arr);

	}

	// Method to find Max & Min Value
	public static void getMinMax(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum value in Array :" + max);
		System.out.println("Minimum value in Array :" + min);

	}
}
