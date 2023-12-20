package Examples;

public class HumanDriverApp {

	public static void main(String[] args) {
		Driver d = new Driver("Driving with gear car", "female");
		System.out.println(d.name + " " + d.age + " " + d.gender + " " + d.skill);
	}

}
