package Encapsulation;

public class TemperatureApp {

	public static void main(String[] args) {
		RoomTemperature rt = new RoomTemperature();
		rt.setTemperature(28);
		System.out.println(rt.getTemperature());
	}

}
