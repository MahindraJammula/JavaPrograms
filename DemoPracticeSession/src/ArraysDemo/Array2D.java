package ArraysDemo;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array 1= ");
		byte[] arr = new byte[sc.nextInt()];
		System.out.println("Enter the size of Array 2 = ");
		byte[] brr = new byte[sc.nextInt()];
		System.out.println("Enter the Elements of array 1 = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextByte();
		}
		System.out.println("Enter the Elements of array 2 = ");
		for (int j = 0; j < arr.length; j++) {
			brr[j] = sc.nextByte();
		}
	}
}
