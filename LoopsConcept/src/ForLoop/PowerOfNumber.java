package ForLoop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entee the base = ");
		int base = sc.nextInt();
		System.out.print("Enter the expo = ");
		int expo = sc.nextInt();
		power(expo, base);
		int pow=power(expo,base);
		System.out.println(base+" to the power "+expo+" is :"+ pow);

	}

	static int power(int expo, int base) {
		int power = 1;
		for (int i = 1; i <= expo; i++) {
			power = power * base;
		}
		return power;
	}

}
