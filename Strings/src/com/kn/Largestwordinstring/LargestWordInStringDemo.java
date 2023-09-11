package com.kn.Largestwordinstring;

public class LargestWordInStringDemo {

	public void largestWordInString(String s1) {
		String word=" ",small="",large="";
		String[] words=new String[100];
		int length=0;
		
		//add extra space after string to get last word in the given string
		s1 = s1+" ";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' '){
				word=word+s1.charAt(i);
			}else {
				words[length]=word;
				length++;
				word="";
			}
		}
		small=large=words[0];
		for(int i=0;i<length;i++) {
			small=words[i];
			if(large.length()<words[i].length())
				large=words[i];
		}
		System.out.println("Smallest word = "+small);
		System.out.println("Largest word = "+large);
	}
}
