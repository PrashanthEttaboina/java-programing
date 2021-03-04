package com.joins;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class LeftJoin {

	static HibernateTemplate htemplate;

	public static HibernateTemplate getHtemplate() {
		return htemplate;
	}

	public void setHtemplate(HibernateTemplate htemplate) {
		LeftJoin.htemplate = htemplate;
	}
	
	
	public void joinl() {
		
		 
		
		List<?> list = getHtemplate().find("select v.name,c.name from Vendor v LEFT JOIN v.customer c");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object rows[] = (Object[])it.next();
			
			System.out.println(rows[0]+ " -- " +rows[1]);
		}

	}

}
