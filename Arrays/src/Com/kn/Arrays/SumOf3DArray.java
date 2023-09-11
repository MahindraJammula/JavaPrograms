package Com.kn.Arrays;

import java.util.Scanner;

public class SumOf3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array Declaration and Creation
		Scanner sc = new Scanner(System.in);
		int[][][] arr = new int[2][2][5];
		int[][][] brr = new int[arr.length][arr[0].length][arr[0][0].length];
		
		//Array Initilization
		System.out.println("Enter the First Array Elements = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				for (int k = 0; k < arr[0][0].length; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("Enter the Second array elements = ");
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[0].length; j++) {
				for (int k = 0; k < brr[0][0].length; k++) {
					brr[i][j][k] = sc.nextInt();

				}
			}
		}
		System.out.println("Sum of  the 3D Arrays = ");
		findsum3DArray(arr,brr);
		product3DArray(arr,brr);
		
	}
	//Method to find the product of array elements
	private static void product3DArray(int[][][] arr, int[][][] brr) {
		int[][][] crr= new int[arr.length][arr[0].length][arr[0][0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				for(int k=0;k<arr[0][0].length;k++) {
					crr[i][j][k]=arr[i][j][k]*brr[i][j][k];
					System.out.println(crr[i][j][k]);
				}
			}
		}
		
	}
	//Method to find the sum of array elements 
	public static void findsum3DArray(int[][][] arr, int[][][] brr) {
		int[][][] crr= new int[arr.length][arr[0].length][arr[0][0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				for(int k=0;k<arr[0][0].length;k++) {
					crr[i][j][k]=arr[i][j][k]+brr[i][j][k];
					System.out.println(crr[i][j][k]);
				}
			}
		}
	}
}
