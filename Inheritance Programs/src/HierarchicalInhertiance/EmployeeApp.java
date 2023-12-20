package HierarchicalInhertiance;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "mahi";
		e.salary = 7000;
		System.out.println(e.name + " " + e.salary);
		e.work();

		Manager m = new Manager();
		m.name = "Sandeep";
		m.salary = 8000;
		System.out.println(m.name + " " + m.salary);
		m.work();

		TeamLead tl = new TeamLead();
		tl.name = "Chintu";
		tl.salary = 6000;
		System.out.println(tl.name + " " + tl.salary);
		tl.work();

	}

}
