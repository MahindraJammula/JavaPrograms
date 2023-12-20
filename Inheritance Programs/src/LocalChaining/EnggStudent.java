package LocalChaining;

public class EnggStudent extends Student {
	int marks;
	int sem;

	public EnggStudent(String name) {
		super();
		this.name = name;
	}

	public EnggStudent(String name, int age) {
		super("Sudheep");
		this.name = name;
		this.age = age;
	}

	public EnggStudent(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.sem = sem;
	}
}
