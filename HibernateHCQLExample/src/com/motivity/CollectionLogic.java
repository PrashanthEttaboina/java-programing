package com.motivity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CollectionLogic {

	
	public static void main(String[] args) {
		Session se=Config.config();
		
		@SuppressWarnings("deprecation")
		Criteria ct=se.createCriteria(Student.class);
		
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(1205);
		l.add(1203);
		Criterion c=Restrictions.in("id",l);
		ct.add(c);
		List li=ct.list();
		Iterator i=li.iterator();
		
		while (i.hasNext()) {
			Student s = (Student) i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
	}
}
