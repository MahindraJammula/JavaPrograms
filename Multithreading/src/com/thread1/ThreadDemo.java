package com.thread1;

//public class ThreadDemo {
//
//	public static void main(String[] args) {
//		PrintNumbers t1=new PrintNumbers();
//		t1.start();
//		
//		PrintCharacters t2=new PrintCharacters();
//		t2.start();
//	}
//
//}
public class ThreadDemo{
	public static void main(String[] args) {
		//creating the objects of classes
		//having independent activities
		PrintNumbers pn=new PrintNumbers();
		PrintCharacters pc=new PrintCharacters();
		
		//creating Thread class object & assigning activities
		Thread t1=new Thread(pn);
		Thread t2=new Thread(pc);
		
		//starting the Thread
		t1.start();
		t2.start();
	}
}