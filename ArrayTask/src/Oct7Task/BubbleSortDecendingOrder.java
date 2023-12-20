package Oct7Task;

import java.util.Scanner;

public class BubbleSortDecendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers = ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSortDescendingOrder(arr);
		System.out.println("Sorted Array in Descending Order:");
		for (int i : arr) {
			System.out.println(i + " ");
		}

	}

	public static void bubbleSortDescendingOrder(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}

}
