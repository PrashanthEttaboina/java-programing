package com.Lotus;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersistLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		Transaction ts=se.beginTransaction();
		StudentDetails sd=new StudentDetails();
		sd.setId(1208);
		sd.setName("Anirudh");
		sd.setMarks(970);
		sd.setAddress("Warangal");
		sd.setParent_name("Narsimha rao");
		
		se.persist(sd); //if the values are present it will update of not it will insert
		ts.commit();

	}

}
