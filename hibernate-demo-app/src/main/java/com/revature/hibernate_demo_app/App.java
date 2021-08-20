package com.revature.hibernate_demo_app;

import java.util.Date;

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
		System.out.println("Project Started...");

		// Create a configuration object
		Configuration cfg = new Configuration();

		// read the config and load in the object
		cfg.configure();

		// create factory
		SessionFactory factory = cfg.buildSessionFactory();

		// create employee
//        Employee employee = new Employee();
//        employee.setId(1);
//        employee.setName("Mark");
//        employee.setEmail("mark@gmail.com");
//        
//        System.out.println(employee.toString());

		// create address
//		Address address = new Address();
//		address.setCity("city 1");
//		address.setStreet("street 1");
//		address.setOpen(true);
//		address.setCreated(new Date());
//		address.setX(123.456);
//
//		Address address2 = new Address();
//		address2.setCity("city 2");
//		address2.setStreet("street 2");
//		address2.setOpen(true);
//		address2.setCreated(new Date());
//		address2.setX(987.654);

		// Open the Session
		Session session = factory.openSession();
		// Begin the transaction
		Transaction transaction = session.beginTransaction();
		// save the employee
		//session.save(employee);
//		session.save(address);
//		session.save(address2);
		
		//Fetch the data
		Address fetch = session.get(Address.class, 1);
		System.out.println(fetch);

		Address fetch2 = session.get(Address.class, 2);
		System.out.println(fetch2);
		
		
		// commit the transaction
		transaction.commit();
		// close the session
		session.close();

//        System.out.println(factory.toString());
//        System.out.println(factory.isClosed());
	}
}
