package com.AdvantagesOfPolymorphism;

public class JavaTeacher extends Teacher {
	public void markAttendance() {
		System.out.println("Java teacher is marking Attendance");
	}

	public void teach() {
		System.out.println("Teacher is teaching Java-language");
	}

	public void doLabPractise() {
		System.out.println("Teacher is doing Java-Lab Code");
	}
}
