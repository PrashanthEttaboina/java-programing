package com.joins;

import java.util.Iterator;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class RightJoin {

	static HibernateTemplate htemplate;

	public static HibernateTemplate getHtemplate() {
		return htemplate;
	}

	public void setHtemplate(HibernateTemplate htemplate) {
		this.htemplate = htemplate;
	}
	
	
	public  void joinr() {
			SessionFactory sf =getHtemplate().getSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			Query qr=session.createQuery("select v.name,c.name from Vendor v RIGHT JOIN v.customer c");
			
		List<?> list = qr.getResultList();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object rows[] = (Object[])it.next();
			
			System.out.println(rows[0]+ " -- " +rows[1]);
		}
	}
}
