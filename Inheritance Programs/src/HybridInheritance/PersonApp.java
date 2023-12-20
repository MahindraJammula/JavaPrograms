package HybridInheritance;

public class PersonApp {

	public static void main(String[] args) {
		EnggStudent e = new EnggStudent();
		BcomStudent b = new BcomStudent();
		JavaTeacher j = new JavaTeacher();
		TestingTeacher t = new TestingTeacher();
		System.out.println(e.name + " " + b.name + " " + j.name + " " + t.name + " ");

	}

}
