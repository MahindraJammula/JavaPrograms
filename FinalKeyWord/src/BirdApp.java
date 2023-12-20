
public class BirdApp {

	public static void main(String[] args) {
		final int a = 10;
		final float pi = 3.14f;
		System.out.println(a);
		// Error:-The final local variable a cannot be reAssigned
		// a=20;
		System.out.println(a);
		final Sparrow s = new Sparrow();
		System.out.println(s);

		// Error:-The final local variable s cannot be reassigned
		// s=new Sparrow();
	}

}
