package com.DownCasting;

public class PlaneApp {

	public static void main(String[] args) {
		Plane ref;
		ref = new FighterPlane("Brahmo");
		ref.takeoff();
		ref.fly();
		((FighterPlane) (ref)).carryArms();

	}

}
