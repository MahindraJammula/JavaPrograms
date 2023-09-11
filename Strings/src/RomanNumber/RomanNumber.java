package RomanNumber;

import java.util.Scanner;

public class RomanNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String srr[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int arr[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		System.out.println("Enter a number = ");
		int num = sc.nextInt();
		StringBuffer roman = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			while (num >= arr[i]) {
				num = num - arr[i];
				roman.append(srr[i]);
			}
		}
		System.out.println(roman);
	}
}
