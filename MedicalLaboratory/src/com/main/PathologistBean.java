package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Pathologist;

public class PathologistBean {

	public static List<Pathologist> getById(int id) {
		
		
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from Pathologist p where lab_doctor_id=:x");
		qe.setParameter("x",id);
		List<Pathologist> pi=qe.list();
		tx.commit();
		if(!pi.isEmpty()) {
			return pi;
		}
		return null;
		
	}	
}
