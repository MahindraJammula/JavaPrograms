package org.kodnest.hibernate_mapping2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Technology t1 = new Technology();
		Technology t2 = new Technology();
		Technology t3 = new Technology();
		Technology t4 = new Technology();

		List<Technology> technologies1 = new ArrayList<Technology>();
		technologies1.add(t1);
		technologies1.add(t3);
		technologies1.add(t4);
		List<Technology> technologies2 = new ArrayList<Technology>();
		technologies2.add(t2);
		technologies2.add(t3);
		List<Technology> technologies3 = new ArrayList<Technology>();
		technologies3.add(t1);
		technologies3.add(t2);
		technologies3.add(t3);
		List<Technology> technologies4 = new ArrayList<Technology>();
		technologies4.add(t3);
		technologies4.add(t4);
		List<Technology> technologies5 = new ArrayList<Technology>();
		technologies5.add(t1);
		technologies5.add(t2);
		technologies5.add(t3);
		technologies5.add(t4);

		Employee e1 = new Employee(1, "Amit", "B", technologies1);
		Employee e2 = new Employee(1, "Ankit", "A", technologies2);
		Employee e3 = new Employee(1, "Aakash", "C", technologies3);
		Employee e4 = new Employee(1, "Ankur", "A", technologies4);
		Employee e5 = new Employee(1, "Anjali", "B", technologies5);

		List<Employee> employee1 = new ArrayList<Employee>();
		employee1.add(e1);
		employee1.add(e3);
		employee1.add(e5);

		List<Employee> employee2 = new ArrayList<Employee>();
		employee2.add(e2);
		employee2.add(e3);
		employee2.add(e5);
		List<Employee> employee3 = new ArrayList<Employee>();
		employee3.add(e1);
		employee3.add(e2);
		employee3.add(e3);
		employee3.add(e4);
		employee3.add(e5);

		List<Employee> employee4 = new ArrayList<Employee>();
		employee4.add(e1);
		employee4.add(e4);
		employee4.add(e5);

		t1.setTechId(111);
		t1.setTechName("Java");
		t1.setEmpolyee(employee1);

		t2.setTechId(222);
		t2.setTechName("Python");
		t2.setEmpolyee(employee2);

		t3.setTechId(333);
		t3.setTechName("MySql");
		t3.setEmpolyee(employee3);

		t4.setTechId(444);
		t4.setTechName("React");
		t4.setEmpolyee(employee4);

		Configuration conf = new Configuration();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		txn.commit();
		System.out.println("======>Done");

	}
}
