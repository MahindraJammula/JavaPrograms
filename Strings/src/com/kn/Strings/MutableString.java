package com.kn.Strings;

public class MutableString {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Ram");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("************************************");
		sb1.append("sita");
		sb1.append("Ram");
		sb1.append("Sita");
		sb1.append("Ram");
		sb1.append("Sita");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}

}
