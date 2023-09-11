package com.kn.Anagram;

public class AnagramDemo {

	public boolean isAnagram(String s1, String s2) {
		boolean isAnagram = false;
		// check length
		if (s1.length() == s2.length()) {
			// convert char array
			char[] crr1 = s1.toCharArray();
			char[] crr2 = s2.toCharArray();
			//convert to lower or upper case
			convertCase(crr1);
			convertCase(crr2);
			crr1 = sortCharacterArray(crr1);
			crr2 = sortCharacterArray(crr2);
			for (int i = 0; i < crr1.length; i++) {
				if (crr1[i] != crr2[i]) {
					return false;
				}
			}
			isAnagram = true;
		}
		return isAnagram;
	}

	private void convertCase(char[] crr) {
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 65 && crr[i] <= 90) {
				crr[i] = (char) (crr[i] + 32);
			}
		}
	}

	// Sort the Array
	public char[] sortCharacterArray(char[] crr) {
		for (int i = 0; i < crr.length - 1; i++) {
			for (int j = 0; j < crr.length - 1 - i; j++) {
				if (crr[j] > crr[j + 1]) {
					char temp = crr[j];
					crr[j] = crr[j + 1];
					crr[j + 1] = temp;
				}
			}
		}
		return crr;
	}
}
