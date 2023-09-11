package Com.kn.Arrays;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Array length-1");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter Array length-2");
		int[] brr = new int[sc.nextInt()];
		System.out.println("enter array-1 elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter array-2 elements");
		for(int i=0;i<arr.length;i++) {
			brr[i]=sc.nextInt();
		}
		int[] crr = mergearray(arr, brr);
		

		// Array Traversing foe Each
		System.out.println("First Array Elements :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Second Array Elements :");
		for (int i : brr) {
			System.out.println(i + " ");
		}
		System.out.println("Merged Arrays ");
		for (int i : crr) {
			System.out.println(i + " ");
		}
	}

	public static int[] mergearray(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int[] crr = new int[arr.length + brr.length];
		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i];
		}
		int j = 0;
		for (int i = arr.length; i < crr.length; i++) {
			crr[i] = brr[j];
			j++;
		}
		return crr;
	}
}
