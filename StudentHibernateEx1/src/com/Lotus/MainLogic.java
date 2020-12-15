package com.Lotus;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		StudentDetails sd=new StudentDetails();
		sd.setId(1206);
		sd.setName("Prashanth");
		sd.setMarks(940);
		sd.setAddress("Warangal");
		sd.setParent_name("Kumar");
		
		Transaction ts=se.beginTransaction();
		se.save(sd);
		ts.commit();
	}

}
