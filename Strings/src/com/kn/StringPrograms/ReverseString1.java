package com.kn.StringPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
		String s1 = "I am Learing Strings in Java";
		String[] srr = s1.split(" ");
		for (int i = srr.length - 1; i >= 0; i--) {
			System.out.print(srr[i] + " ");
		}
	}
}
