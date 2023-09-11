package Com.kn.Arrays;

import java.util.Scanner;

public class BubbleSorting {

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
		System.out.println();
		System.out.println("Befor sorting : ");
		for (int x : arr) {
			System.out.println(x + " ");
		}
		BubbleSortingDemo array = new BubbleSortingDemo();
		array.bubbleSort(arr);
		// Array Traversing
		System.out.println();
		System.out.println("After Sorting : ");
		for (int x : arr) {
			System.out.println(x + " ");
		}
	}
}
