package Com.kn.Arrays;

import java.util.Scanner;

public class Jagged3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Array Declaration and Creation
		int[][][] arr;
		arr = new int[2][][];
		arr[0] = new int[1][];
		arr[1] =new int[2][];
		arr[0][0] =new int[2];
		arr[1][0] =new int[3];
		arr[1][1] =new int[2];
		//System.out.println("Enter the Array = ");
		//int[][][] arr = new int[sc.nextInt()][][];
		//for (int i = 0; i < arr.length; i++) {
			//for (int j = 0; j < arr[i].length; j++) {
				//System.out.println("Enter the size of " + (i + 1) + " : ");
				//arr[i] = new int[sc.nextInt()][];
				//arr[j] = new int[sc.nextInt()][];
			//}
		//}

		// Array Initialization
		System.out.println("Enter the index values =");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(" Elements are = " + arr[i][j][k]);
				}
			}
		}
	}
}
