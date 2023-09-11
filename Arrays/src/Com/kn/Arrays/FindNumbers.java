package Com.kn.Arrays;

import java.util.Scanner;

public class FindNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Index Number = ");
		// Array Declaration and Creation
		int[] arr = { 2, 3, 5, 6, 8, 9, 10 };
		
		int findnumber = sc.nextInt();

		findnumber(arr, findnumber);

	}

	// Method to find the number
	public static void findnumber(int[] arr, int findnumber) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findnumber) {
				System.out.println("Position of Element is " + (i+1) );
			}
			else {
				System.out.println("NOt found");
		}
		
		}
	}
}
