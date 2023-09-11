package com.kn.Strings;

public class StringCompareTo {

	public static void main(String[] args) {
		String s1="sandy";
		String s2="mahi";
		//s1.compareTo(s2);
		System.out.println(s1.compareTo(s2));
		if(s1.compareTo(s2)>0) {
			System.out.println("S1 is greater than S2");
		}
		else if(s1.compareTo(s2)<0){
			System.out.println("S1 & S2 are Equal Lexicographically");
		}
	}

}
