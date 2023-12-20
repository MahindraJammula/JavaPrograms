package Oct7Task;

import java.util.Scanner;

public class BorderElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of a= ");
		int a = sc.nextInt();
		System.out.println("Enter a numbers of b= ");
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Border Elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
