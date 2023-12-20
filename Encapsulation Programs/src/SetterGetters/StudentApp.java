package SetterGetters;

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("Mahi");
		s.setMarks(99);
		s.setGender("Male");
		System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks() + " " + s.getGender() + " ");
	}
}
