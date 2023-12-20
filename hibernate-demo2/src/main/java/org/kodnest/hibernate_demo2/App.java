package org.kodnest.hibernate_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
//		Bike b1 = new Bike(111, "BMW", 3000000);
//		Bike b2 = new Bike(222, "Ns200", 2000000);
//		Bike b3 = new Bike(333, "KTMDuke", 205000);

		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();

		Students s1 = new Students(1, "Mahi", 99, b3);
		Students s2 = new Students(2, "Sandy", 89, b1);
		Students s3 = new Students(3, "Chintu", 79, b2);

		b1.setRegNumber(111);
		b1.setModel("BMW");
		b1.setCost(3000000);
		b1.setStudents(s2);

		b2.setRegNumber(222);
		b2.setModel("Ns200");
		b2.setCost(2000000);
		b2.setStudents(s3);

		b3.setRegNumber(333);
		b3.setModel("KTM");
		b3.setCost(205000);
		b3.setStudents(s1);

		// 1.Configure the hibernate.cfg.xml file
		Configuration conf = new Configuration();
		conf.configure();// configure ("hibernate.cfg.xml");

		// 2.Build SessionFactory using Configuration
		SessionFactory factory = conf.buildSessionFactory();
		System.out.println("Hibernate started working successfully - " + factory.toString());

		// 3.Open Session using SessionFactory
		Session session = factory.openSession();

		// 4.Begin Transaction using Session
		Transaction txn = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);

		session.save(b1);
		session.save(b2);
		session.save(b3);

		// 5.Commit the Transaction
		txn.commit();
		System.out.println("--->" + s1 + " has been stored in database");
		System.out.println("--->" + s2 + " has been stored in database");
		System.out.println("--->" + s3 + " has been stored in database");
		System.out.println("--->" + b1 + " has been stored in database");
		System.out.println("--->" + b2 + " has been stored in database");
		System.out.println("--->" + b3 + " has been stored in database");
	}
}
