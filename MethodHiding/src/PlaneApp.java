
public class PlaneApp {

	public static void main(String[] args) {
		Plane ref = new PassengerPlane();
		ref.fly();
		ref.carrysomething();// Plane.carrysomething();
		((PassengerPlane) (ref)).carrysomething();// = PassengerPlane
	}

}
