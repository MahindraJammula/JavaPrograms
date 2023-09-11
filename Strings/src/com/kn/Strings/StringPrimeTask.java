package com.kn.Strings;

public class StringPrimeTask {

	public static void main(String[] args) {
		String s="123456789";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			int res=((int)c-48);
			if(res==2||res==3||res==5||res==7) {
				sum+=res;
			}
		}
		System.out.println(sum);
	}
}
