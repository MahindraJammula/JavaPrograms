package Com.kn.Arrays;

import java.util.Scanner;

public class FindElementPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size = ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the Elements = "); 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Element to be found = ");
		int find = sc.nextInt();
		int position = findelementposition(arr, find);
		System.out.println("The Element " + find + " Found at Position " + position);

	}

	public static int findelementposition(int[] arr, int find) {
		// TODO Auto-generated method stub
		boolean isFound = false;
		// int position = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				isFound = true;
				// position = arr[i];
				return i;
			}
		}
		return -1;
	}
}
