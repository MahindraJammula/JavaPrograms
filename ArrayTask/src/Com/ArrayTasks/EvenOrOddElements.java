package Com.ArrayTasks;

import java.util.Scanner;

public class EvenOrOddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array = ");
		//Array Declaration and Creation
		int[] arr=new int[sc.nextInt()];
				
		//Array Initilization
		for(int i=0;i<arr.length;i++){
		System.out.print("Enter the Elements "+(i+1)+ " = ");
		arr[i] = sc.nextInt();
		}
		EvenorOddElementsDemo array = new EvenorOddElementsDemo();
		array.printevenorodd(arr);
		array.countevenorcountodd(arr);
		
	}
	
}

