package org.kodnest.spring02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-content.xml");
		Laptop l1 = (Laptop) context.getBean("laptop1");
		System.out.println(l1);

		Laptop l2 = (Laptop) context.getBean("laptop2");
		System.out.println(l2);
	}
}