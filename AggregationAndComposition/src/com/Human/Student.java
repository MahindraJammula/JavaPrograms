package com.Human;

public class Student extends Human {
	Book bk;
	Car c;

	public void HasA(Book ref) {
		bk = ref;
		System.out.println(bk.getAuthor());
		System.out.println(bk.getName());
		System.out.println(bk.getPrice());
	}

	public void hasA(Car ref) {
		c = ref;
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println(c.getCost());
	}

}
