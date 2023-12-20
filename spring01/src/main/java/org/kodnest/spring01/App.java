package org.kodnest.spring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.Student;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Student s1 = (Student) context.getBean("s1");
		System.out.println("----->Obect created by Spring = " + s1);
	}

}
