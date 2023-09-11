package Com.kn.Arrays;

import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Array Declaration
		double[] arr;

		// Array Creation
		System.out.print("Enter the size of Element = ");
		arr = new double[sc.nextInt()];
		
		
		// Array Initilization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the Element " + (i + 1) + " = ");
			arr[i] = sc.nextDouble();
		}
		
		//Array Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
