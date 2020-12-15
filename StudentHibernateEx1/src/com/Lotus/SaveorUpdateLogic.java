package com.Lotus;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveorUpdateLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		Transaction ts=se.beginTransaction();
		StudentDetails sd=new StudentDetails();
		sd.setId(1207);
		sd.setName("Pranav Peddi");
		sd.setMarks(990);
		sd.setAddress("Warangal");
		sd.setParent_name("Sudheer");
		
		se.saveOrUpdate(sd);
		ts.commit();

	}

}
