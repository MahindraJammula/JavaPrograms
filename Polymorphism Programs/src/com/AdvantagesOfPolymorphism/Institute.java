package com.AdvantagesOfPolymorphism;

public class Institute {

	public void acceptTeacher(Teacher ref){
		ref.markAttendance();
		ref.teach();
		ref.doLabPractise();
	}

}
