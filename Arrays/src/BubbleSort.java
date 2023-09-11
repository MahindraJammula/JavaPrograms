import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		// Bubble sort
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count = 1;
				}
			}
			if (count == 0) {
				break;
			}
		}
		// Array Traversing
		System.out.println();
		System.out.println("After Sorting : ");
		for (int x : arr) {
			System.out.println(x + " ");
		}
		System.out.println();
		System.out.println("Minimum value : " + arr[0]);
		System.out.println("2nd Minimum value : " + arr[1]);
		System.out.println("Maximum value : " + arr[arr.length - 1]);
		System.out.println("2nd Maximum value : " + arr[arr.length - 2]);
	}
}
