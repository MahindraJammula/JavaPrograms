package SetterConstructor;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student(1, "Mahi", 99, "Male");
		System.out.println(student.getId() + " " + student.getName() + " " + student.getMarks() + " " + student.getGender() + " ");
	}
}
