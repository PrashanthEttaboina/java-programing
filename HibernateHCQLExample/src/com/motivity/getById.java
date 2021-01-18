package com.motivity;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class getById {

	public static void main(String args[])
	{
		Session se=Config.config();
		
		CriteriaBuilder cb=se.getCriteriaBuilder();
		CriteriaQuery<Student> cq=cb.createQuery(Student.class);
		Root<Student> root=cq.from(Student.class);
		cq.select(root);
		cq.where(cb.equal(root.get("id"),1203));
		
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
