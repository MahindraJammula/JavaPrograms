package com.kn.NumbertoWord;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		if (number < 1 || number > 9999) {
			System.out.println("Invalid Number");
		} else {
			int a = number % 10; // last digit
			int b = number / 10;
			int c = b % 10;
			int g = number / 100;
			int d = g % 10;
			int e = number / 1000;
			String sD[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
					"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen" };
			String ty[] = { "", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
			String h = "Hundred";
			String th = "Thousand";
			if (number < 20)
				System.out.println(sD[number]);
			else if (number >= 20 && number <= 100)
				System.out.println(ty[c] + " " + sD[a]);
			else if (number >= 100 && number <= 999)
				System.out.println(sD[g] + " " + h + " " + ty[c] + " " + sD[a]);
			else
				System.out.println(sD[e] + " " + th + " " + sD[d] + " " + h + " " + ty[c] + " " + sD[a]);

		}
		scan.close();
	}

}
