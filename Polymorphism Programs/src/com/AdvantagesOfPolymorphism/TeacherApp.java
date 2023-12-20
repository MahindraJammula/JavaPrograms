package com.AdvantagesOfPolymorphism;

public class TeacherApp {

	public static void main(String[] args) {
		CTeacher ct = new CTeacher();
		JavaTeacher jt = new JavaTeacher();
		PythonTeacher pt = new PythonTeacher();

		Institute i = new Institute();
		i.acceptTeacher(ct);
		i.acceptTeacher(jt);
		i.acceptTeacher(pt);

		Teacher ref;
		fun(ct);
		fun(jt);
		fun(pt);
	}

	public static void fun(Teacher ref) {
		ref.doLabPractise();
		ref.markAttendance();
		ref.teach();
	}
}
