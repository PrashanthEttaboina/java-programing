package com.Lotus;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoadLogic {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		Transaction ts=se.beginTransaction();
		StudentDetails s=se.load(StudentDetails.class, 1203);
		System.out.println("Student id="+s.getId()+"\nStudent Name= "+s.getName()+"\nMarks= "+s.getMarks()+"\nAddress= "+s.getAddress()+"\nParent Name= "+s.getParent_name());
	}
}
