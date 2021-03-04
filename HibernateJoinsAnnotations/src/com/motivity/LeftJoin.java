package com.motivity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class LeftJoin {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		Query qr=se.createQuery("select v.name,c.name from Vendor v LEFT JOIN v.customer c");
		List<Object[]> list = qr.list();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object rows[] = (Object[])it.next();
			
			System.out.println(rows[0]+ " -- " +rows[1]);
		}

	}

}
