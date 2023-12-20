package org.kodnest.spring05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
	}
}
