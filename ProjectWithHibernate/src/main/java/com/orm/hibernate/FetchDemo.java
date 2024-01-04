package com.orm.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// get student of id 101
//		Student student1 = session.get(Student.class, 101);
//		System.out.println(student1);
//		
//		Student student2 = session.get(Student.class, 101);
//		System.out.println(student2);
		
		// load address of id 1
		Address address = session.load(Address.class, 1);
		System.out.println(address);
		System.out.println(address.getStreet());
		
		session.close();
		factory.close();

	}

}
