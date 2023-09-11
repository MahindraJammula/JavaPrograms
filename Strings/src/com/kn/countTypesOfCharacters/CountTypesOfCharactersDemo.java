package com.kn.countTypesOfCharacters;

public class CountTypesOfCharactersDemo {

	public void countVowels(String s) {
		int vowels = 0;
		int consosants = 0;
		int digit = 0;
		int specialcharacter = 0;
		String s1 = s.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				vowels++;
			} else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				consosants++;
			} else if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				digit++;
			} else {
				specialcharacter++;
			}
		}
		System.out.println("Vowels = "+vowels);
		System.out.println("consosants = "+consosants );
		System.out.println("digit = "+digit );
		System.out.println("specialcharacter = "+specialcharacter );
	}
}
