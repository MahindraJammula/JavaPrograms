package org.kodnest.hibernate_mapping1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kn.entity.Customer;
import com.kn.entity.Products;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Products p1 = new Products();
		Products p2 = new Products();
		Products p3 = new Products();
		Products p4 = new Products();

		List<Products> list1 = new ArrayList<Products>();
		list1.add(p1);
		list1.add(p2);
		List<Products> list2 = new ArrayList<Products>();
		list1.add(p3);
		list1.add(p4);

		Customer c1 = new Customer(1, "Amit", 22, list1);
		Customer c2 = new Customer(2, "Ankit", 24, list2);

		p1.setProductId(111);
		p1.setProductname("keyboard");
		p1.setCost(1000);
		p1.setCustomer(c1);

		p2.setProductId(222);
		p2.setProductname("Mouse");
		p2.setCost(700);
		p2.setCustomer(c1);

		p3.setProductId(333);
		p3.setProductname("TV");
		p3.setCost(150000);
		p3.setCustomer(c2);

		p4.setProductId(444);
		p4.setProductname("Camera");
		p4.setCost(125000);
		p4.setCustomer(c2);

		Configuration conf = new Configuration();
		conf.configure();

		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		session.save(c1);
		session.save(c2);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		txn.commit();
		System.out.println("------>Done");

	}
}
