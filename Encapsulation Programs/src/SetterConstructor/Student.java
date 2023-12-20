package SetterConstructor;

public class Student {
	private int id;
	private String name;
	private int marks;
	private String gender;

	public Student(int id, String name, int marks, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public String getGender() {
		return gender;
	}

}
