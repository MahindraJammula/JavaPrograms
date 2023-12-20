package com.Student;

public class Student {
	Brain b = new Brain(900, "White");
	Book bk;

	public void HasA(Book ref) {
		bk = ref;
		System.out.println(bk.getAuthor());
		System.out.println(bk.getName());
		System.out.println(bk.getPrice());
	}
}
