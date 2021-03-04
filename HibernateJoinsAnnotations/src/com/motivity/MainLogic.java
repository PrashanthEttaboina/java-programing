package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure();
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Customer c=new Customer();
		c.setId(207);
		c.setName("revanth");
		Customer c1=new Customer();
		c1.setId(208);
		c1.setName("pranav");
		
		
//		Vendor v1=new Vendor();
//		v1.setId(102);
//		v1.setName("Amazon");
//		
//		Vendor v2=new Vendor();
//		v2.setId(103);
//		v2.setName("Myntra");
		
//		Set<Customer> s=new HashSet<>();
//		s.add(c);
//		s.add(c1);
//		v1.setCustomer(s);
		
		se.save(c);
		se.save(c1);
//		se.save(v1);
//		se.save(v2);
		tx.commit();
		
		
		se.close();
		sf.close();
	}

}