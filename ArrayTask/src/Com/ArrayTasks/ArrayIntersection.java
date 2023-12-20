package Com.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size = ");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter Array size = ");
		int n2 = sc.nextInt();
		int arr2[] = new int[n1];
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}
		int intersection[] = findArrayInterSection(arr1, arr2);
		System.out.println(Arrays.toString(intersection));
	}

	private static int[] findArrayInterSection(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;
		int k = 0;
		int[] result = new int[Math.min(arr1.length, arr2.length)];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				result[k++] = arr1[i++];
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return Arrays.copyOf(result, k);
	}
}