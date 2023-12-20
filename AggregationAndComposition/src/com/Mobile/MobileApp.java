package com.Mobile;

public class MobileApp {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println(m.os.name);
		System.out.println(m.os.type);
		Charger c = new Charger("Black", "Redmi", "C-type");
		m.HasA(c);
		m = null;
		// System.out.println(m.os.name);
		// System.out.println(m.os.type);
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println(c.getType());
	}

}
