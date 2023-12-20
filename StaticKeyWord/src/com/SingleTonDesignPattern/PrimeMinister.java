package com.SingleTonDesignPattern;

public class PrimeMinister {
	static private PrimeMinister pm = null;
	// static PrimeMinister pm = null;
	String name;
	int age;
	String gender;

	private PrimeMinister(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static PrimeMinister getInstance() {
		if (pm == null) {
			pm = new PrimeMinister("Modi", 74, "Male");
		}
		return pm;
	}

	public void meet() {
		System.out.println("Meeting Happening");
	}

	public void relation() {
		System.out.println(name + " Primeminister having meeting with other CM's");
	}

	public void takecareofcountercitizen() {
		System.out.println(name + " Primeminister is take care");
	}

	public static PrimeMinister getInstance1() {
		if (pm == null) {
			pm = new PrimeMinister("Modi", 74, "Male");
		}
		return pm;
	}
}
