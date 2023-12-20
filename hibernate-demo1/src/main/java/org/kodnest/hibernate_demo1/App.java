package org.kodnest.hibernate_demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class App {
	public static void main(String[] args) {
		
		Student s1=new Student(1,"mahi",99);
		
		//1.Configure the hibernate.cfg.xml file
		Configuration conf = new Configuration();
		conf.configure();// configure ("hibernate.cfg.xml");
		
		//2.Build SessionFactory using Configuration
		SessionFactory factory = conf.buildSessionFactory();
		System.out.println("Hibernate started working successfully - " + factory.toString());
		
		//3.Open Session using SessionFactory
		Session session = factory.openSession();
		
		//4.Begin Transaction using Session
		Transaction txn = session.beginTransaction();
		session.save(s1);
		
		//5.Commit the Transaction
		txn.commit();
		System.out.println("--->"+s1+" has been stored in database");

	}
}
