package org.kodnest.spring04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-content.xml");
		University u = (University) context.getBean("university");
		System.out.println(u);
	}
}
