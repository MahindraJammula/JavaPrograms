package com.kn.CeaserCipher;

public class CeaserCipherDemo {

	public char[] ceaseCipher(String s1, int n) {
		char[] crr = s1.toCharArray();
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 65 && crr[i] <= 90) {
				if (crr[i] + n <= 90) {
					crr[i] = (char) (crr[i] + n);
				} else {
					crr[i] = (char) (crr[i] - 26 + n);
				}
			} else if (crr[i] >= 97 && crr[i] <= 122) {
				if (crr[i] + n <= 122) {
					crr[i] = (char) (crr[i] + n);
				} else {
					crr[i] = (char) (crr[i] - 26 + n);
				}
			} else if (crr[i] >= 48 && crr[i] <= 57) {
				if (crr[i] + n <= 57) {
					crr[i] = (char) (crr[i] + n);
				} else {
					crr[i] = (char) (crr[i] - 9 + n);
				}
			}
		}
		return crr;
	}
}
