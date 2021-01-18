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
		
		Student s1=new Student();
		s1.setSid(1203);
		s1.setSname("Prashanth");
		
		Student s2=new Student();
		s2.setSid(1204);
		s2.setSname("Vasanth");
		
		Course c1=new Course();
		c1.setCid(1);
		c1.setCname("Java");
		
		Course c2=new Course();
		c2.setCid(2);
		c2.setCname("Data Structures");
		
		Set<Student> s=new HashSet<Student>();
		s.add(s1);
		s.add(s2);
		Set<Student> ss=new HashSet<Student>();
		ss.add(s1);
		ss.add(s2);
		
		
		c1.setStudent(s);
		c2.setStudent(ss);
		
		se.save(c1);
		se.save(c2);
		
		tx.commit();

	}

}
