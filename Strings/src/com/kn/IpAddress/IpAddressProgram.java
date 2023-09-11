package com.kn.IpAddress;

import java.util.Scanner;

public class IpAddressProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String s1 = sc.nextLine();
		IpAddressDemo demo = new IpAddressDemo();
		boolean isValid = demo.validIpAddress(s1);
		if (isValid) {
			System.out.println("VALID");
		} else {
			System.out.println("NOT VALID");
		}
		sc.close();
	}
}
