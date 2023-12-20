package MultiLevelInheritance;

public class CarApp {

	public static void main(String[] args) {
		Sedan s=new Sedan();
		s.regno=1234;
		s.move();
		
		Car c=new Car();
		c.regno=9999;
		c.move();
		
		Vehicle v=new Vehicle();
		v.regno=4545;
		v.move();

	}

}
