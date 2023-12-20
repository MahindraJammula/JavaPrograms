
public class Monkey extends Animal {
	String name = "Monkey";

	@Override
	public void eat() {
		System.out.println(super.name);
		super.eat();
		System.out.println(name + " is Eating");
	}
}
