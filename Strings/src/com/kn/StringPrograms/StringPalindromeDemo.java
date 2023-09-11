package com.kn.StringPrograms;

public class StringPalindromeDemo {

	public String StringPalindromeDemo(String s1) {
		char[] crr = s1.toCharArray();
		StringBuffer r = new StringBuffer();
		for (int i = s1.length() - 1; i >= 0; i--) {
			r = r.append(crr[i]);
		}
		String s2 = r.toString();

		if (s1.equals(s2)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not a palindrome String");
		}
		return s2;
	}
}
