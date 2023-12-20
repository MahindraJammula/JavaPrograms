package com.WhereStatic;

public class SiApp {
	public static void main(String[] args) {
		BusinessMan b1 = new BusinessMan("Malya");
		BusinessMan b2 = new BusinessMan("Modi");
		BusinessMan b3 = new BusinessMan("Adani");
		b1.takeinput();
		b1.calculate();
		b1.display();
		b2.takeinput();
		b2.calculate();
		b2.display();
		b3.takeinput();
		b3.calculate();
		b3.display();
	}
}
