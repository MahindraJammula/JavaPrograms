package com.DownCasting;

public class FighterPlane extends Plane {
	public FighterPlane(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println(name + "Plane is very fast flying.......");
	}

	public void carryArms() {
		System.out.println(name + " is Carrying Arms and Wepons");
	}

}
