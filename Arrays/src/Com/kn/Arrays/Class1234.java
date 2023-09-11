package Com.kn.Arrays;

import java.util.Scanner;

public class Class1234 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Array Declaration and Creation
		System.out.println("Enter the number of Batches = ");
		String[][] arr = new String[sc.nextInt()][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the number of friends in A "+(i+1)+ " Batch : ");
			arr[i]= new String[sc.nextInt()];
		}
		
		//arr[0] = new String[3];
		//arr[1] = new String[1];
		//arr[2] = new String[1];
		//arr[3] = new String[2];
		// Array Initilization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter A" + (i + 1) + " Batch Friends : ");
			System.out.println(" I Have " +arr[i].length +" Friends ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Friend Name" + (j + 1) + " : ");
				arr[i][j] = sc.next();

			}
		}
		System.out.println("******************************************");
		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Batch " + (i + 1) + " : ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(" Friend Name " + (j + 1) + " :" + arr[i][j]);
			}
		}

	}

}
