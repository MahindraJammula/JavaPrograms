package com.kn.FirstLetterUpperCase;

public class CaseSensitiveDemo {

	public String upperToLowerCase(String inputstring) {
		String[] srr = inputstring.split(" ");
		StringBuffer sb = new StringBuffer();
		for (String s : srr) {
			char[] crr = s.toCharArray();
			if (crr[0] >= 97 && crr[0] <= 122) {
				crr[0] = (char) (crr[0] - 32);
			} else if (crr[0] >= 65 && crr[0] <= 90) {
				crr[0] = (char) (crr[0] + 32);
			}
			for (int i = 0; i < crr.length; i++) {
				sb.append(crr[i]);
			}
			sb.append(" ");
		}
		String res = sb.toString();
		return res.trim();
	}
}
