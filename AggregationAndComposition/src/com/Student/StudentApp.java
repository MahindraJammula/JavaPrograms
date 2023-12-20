package com.Student;

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.b.getColor());
		System.out.println(s.b.getWeight());
		Book book = new Book("Let us C", "Mahi", 1000);
		s.HasA(book);
		s = null;
		System.out.println("Student object Destroyed");
		System.out.println(book.getAuthor());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
	}

}
