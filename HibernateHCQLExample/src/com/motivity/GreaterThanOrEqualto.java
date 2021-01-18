package com.motivity;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;


public class GreaterThanOrEqualto {

	public static void main(String[] args) {
		
	/*	Session se=Config.config();
		
		@SuppressWarnings("deprecation")
		Criteria ct=se.createCriteria(Student.class);
	
		Criterion c=Restrictions.ge("marks",910);
		ct.add(c);
		List li=ct.list();
		Iterator i=li.iterator();
		
		while (i.hasNext()) {
			Student s = (Student) i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		} */
		
		
		Session se=Config.config();
		
		CriteriaBuilder cb=se.getCriteriaBuilder();
		CriteriaQuery<Student> cq=cb.createQuery(Student.class);
		Root<Student> root=cq.from(Student.class);
		cq.select(root);
		cq.where(cb.greaterThanOrEqualTo(root.get("marks"),910));
		
		Query q=se.createQuery(cq);
		List<Student> list =q.getResultList();
		
		Iterator<Student> l=list.iterator();
		while(l.hasNext())
		{
			Student s=l.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}	
	}

}
