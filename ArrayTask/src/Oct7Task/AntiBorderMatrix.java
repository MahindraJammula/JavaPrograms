package Oct7Task;

import java.util.Scanner;

public class AntiBorderMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rows length = ");
		int a = sc.nextInt();
		System.out.println("Enter a coloumns lenght = ");
		int b = sc.nextInt();
		int[][] arr = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a; i++) {
			System.out.print(arr[i][0] + " ");
		}
		for (int i = 1; i < b; i++) {
			System.out.print(arr[a - 1][i] + " ");
		}
		for (int i = a - 2; i >= 0; i--) {
			System.out.print(arr[i][b - 1] + " ");
		}
		for (int i = b - 2; i > 0; i--) {
			System.out.print(arr[0][i] + " ");
		}

	}

}
