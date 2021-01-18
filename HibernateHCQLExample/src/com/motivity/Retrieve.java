package com.motivity;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Retrieve {

	public static void main(String[] args) {
		Session se=Config.config();
		
		CriteriaBuilder builder = se.getCriteriaBuilder();
        CriteriaQuery<Student> query = builder.createQuery(Student.class);
        Root<Student> root = query.from(Student.class);
        query.select(root);
        Query q=se.createQuery(query);
        
		
		List<Student> students=q.getResultList();
		
		Iterator<Student> i=students.iterator();
		while (i.hasNext()) {
			Student s = (Student) i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
	}
}
