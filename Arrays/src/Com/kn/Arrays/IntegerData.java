package Com.kn.Arrays;

import java.util.Scanner;

public class IntegerData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Array declaration
		int[] arr;
		
		
		//Array Creation
		System.out.print("Enter the size of Element = ");
		arr = new int [sc.nextInt()];
		

		//Array Initilization
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the integer element "+ (i+1)+ " = ");
			arr[i]=sc.nextInt();
		}
		
		//Array Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println("the entered element "+arr[i]);
		}

	}

}
