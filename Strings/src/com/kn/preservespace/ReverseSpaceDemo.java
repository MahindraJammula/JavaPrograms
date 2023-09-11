package com.kn.preservespace;

public class ReverseSpaceDemo {
	// Method Preserving space
	public String reverseSpaceMaintain(String inputstring) {
		char[] crr = inputstring.toCharArray();
		char[] revarr = new char[crr.length];
		// copy spaces 1st
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] == ' ') {
				revarr[i] = crr[i];
			} 
		}
		// Reverse the Char Array
		int j = revarr.length - 1;
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] != ' ') {
				if (revarr[j] == ' ') {
					j--;
				}
				revarr[j] = crr[i];
				j--;
			}
		}
		inputstring = new String(revarr);
		return inputstring;
	}
}
