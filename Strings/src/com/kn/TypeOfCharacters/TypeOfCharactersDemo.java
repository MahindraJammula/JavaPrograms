package com.kn.TypeOfCharacters;

public class TypeOfCharactersDemo {

	public void countTypeOfCharacters(String s1) {
		int vowels = 0;
		int Vowels = 0;
		int consonants = 0;
		int uconsonants = 0;
		int digit = 0;
		int specialcharacter = 0;
		int spaces = 0;
		String s2 = s1.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				vowels++;
			} else if (s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O'
					|| s1.charAt(i) == 'U') {
				Vowels++;
			} else if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
				uconsonants++;
			} else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				consonants++;
			} else if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				digit++;
			} else if (s1.charAt(i) == 32) {
				spaces++;
			} else {
				specialcharacter++;
			}
		}
		System.out.println("Upper case Vowels = " + vowels);
		System.out.println("Lower case Vowels = " + Vowels);
		System.out.println("Upper case consosants = " + uconsonants);
		System.out.println("Lower case consosants = " + consonants);
		System.out.println("digit = " + digit);
		System.out.println("specialcharacter = " + specialcharacter);
		System.out.println("Spaces = " + spaces);
	}

}
