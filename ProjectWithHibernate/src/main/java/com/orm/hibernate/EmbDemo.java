package com.orm.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbDemo {

	public static void main(String[] args) {
		// factory configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// Setting Student class values to the properties
		Student student = new Student();
		student.setId(100);
		student.setName("Amir Yajdani");
		student.setCity("Delhi");
		
		// Certificate object
		Certificate certificate = new Certificate();
		certificate.setCourse("Hibernate");
		certificate.setDuration("1 Month");
		
		student.setCerti(certificate);
		// session open
		Session session = factory.openSession();
		// Physically changes into database so use transaction
		Transaction transaction = session.beginTransaction();
		
		// objects save
		session.save(student);
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
