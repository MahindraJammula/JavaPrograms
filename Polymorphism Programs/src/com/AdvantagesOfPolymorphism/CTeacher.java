package com.AdvantagesOfPolymorphism;

public class CTeacher extends Teacher {
	public void markAttendance() {
		System.out.println("C teacher is marking Attendance");
	}

	public void teach() {
		System.out.println("Teacher is teaching C-language");
	}

	public void doLabPractise() {
		System.out.println("Teacher is doing C-Lab Code");
	}
}
