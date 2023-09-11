package Com.kn.Arrays;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Array Declaration
		String[] arr;
		
		//Array Creation
		System.out.print("Enter the size Of Element = ");
		arr = new String[sc.nextInt()];
		
		//Array Initilization
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the Elements "+ (i+1)+ " = ");
			arr[i] = sc.next();
		}
		
		//Array Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
