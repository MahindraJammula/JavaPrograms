package com.kn.object;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students object to be created = ");
		Student[] srr = new Student[sc.nextInt()];

		for (int i = 0; i < srr.length; i++) {
			System.out.println("Enter Id for Student " + (i + 1) + " = ");
			int id = sc.nextInt();
			System.out.println("Enter Name for Student " + (i + 1) + " = ");
			String name = sc.next();
			System.out.println("Enter Marks for Student " + (i + 1) + " = ");
			int marks = sc.nextInt();
			Student s = new Student(id, name, marks);
			srr[i] = s;
		}
		// PRINT THE DATA
		for (Student s : srr) {
			// System.out.println("Id = " + s.id + " , Name = " + s.name + " , Marks = " +
			// s.marks);
			// }

			if (s.marks < 35) {
				int grace = 35 - s.marks;
				System.out.println("Id = " + s.id + " , Name = " + s.name + " , Marks = " + s.marks);
				System.out.println("After Grace");
				System.out.println("Grace Marks = " + (s.marks + grace));
			}
		}
	}
}
