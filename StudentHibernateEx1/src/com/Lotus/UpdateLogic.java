package com.Lotus;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		Transaction ts=se.beginTransaction();
		StudentDetails s=se.load(StudentDetails.class, 1206);
		s.setName("Revanth Sai");
		se.update(s);
		ts.commit();

	}

}
