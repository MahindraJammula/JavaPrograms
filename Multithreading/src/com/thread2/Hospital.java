package com.thread2;

public class Hospital {

	public static void main(String[] args) {
//		Hospital h = new Hospital();
//
//		Treatment tom = new Treatment(h);
//		Treatment jerry = new Treatment(h);
		
		Treatment treatment = new Treatment();
		Thread t1 = new Thread(treatment);
		Thread t2 = new Thread(treatment);
		

//		Thread t1 = new Thread(tom);
//		Thread t2 = new Thread(jerry);
		
		t1.setName("Tom");
		t2.setName("Jerry"); 

		t1.start();
		t2.start();

	}

}
