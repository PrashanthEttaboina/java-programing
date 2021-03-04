package com.joins;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class InnerJoin {

	HibernateTemplate htemplate;

	public HibernateTemplate getHtemplate() {
		return htemplate;
	}

	public void setHtemplate(HibernateTemplate htemplate) {
		this.htemplate = htemplate;
	}
	
	public void joini() {
		
		List<?> list = getHtemplate().find("select v.name,c.name from Vendor v INNER JOIN v.customer c");
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object rows[] = (Object[])it.next();
			
			System.out.println(rows[0]+ " -- " +rows[1]);
		}
	}
}
