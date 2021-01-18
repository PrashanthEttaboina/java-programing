package com.motivity;

import java.util.HashSet;
import java.util.Set;

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

		Transaction tx=se.beginTransaction();	
		
		Students s1=new Students();
		s1.setStudent_id(1203);
		s1.setStudent_name("Prashanth");
		
		Students s2=new Students();
		s2.setStudent_id(1204);
		s2.setStudent_name("Vasanth");
		
		Course c1=new Course();
		c1.setCourse_id(1);
		c1.setCourse_name("Java");
		
		Course c2=new Course();
		c2.setCourse_id(2);
		c2.setCourse_name("Data Structures");
		
		Set<Students> s=new HashSet<Students>();
		s.add(s1);
		s.add(s2);
		
		c1.setStudents(s);
		c2.setStudents(s);
		
		se.save(c1);
		se.save(c2);
		tx.commit();
		
		
	}

}
