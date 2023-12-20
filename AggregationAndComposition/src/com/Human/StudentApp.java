package com.Human;

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student();
		Book b = new Book("Mahi", "Sandy", 1000);
		Car c = new Car("Mahindra", "Black", 2500000);
		s.HasA(b);
		s.hasA(c);

	}

}
