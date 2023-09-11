package com.kn.StringPrograms;

import java.util.Scanner;

public class StringReverse {
	// Method
	public String StringReverse(String s1) {
		char[] crr = s1.toCharArray();
		StringBuffer s2 = new StringBuffer();
		for (int i = crr.length - 1; i >= 0; i--) {
			s2 = s2.append(crr[i]);
		}
		return s2.toString();
	}
}
