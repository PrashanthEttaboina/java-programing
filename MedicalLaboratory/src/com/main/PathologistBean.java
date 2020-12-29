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
	
		Query qe=se.createQuery("from Pathologist p where p.lab_doctor_id=:x");
		qe.setParameter("x",id);
		List<Pathologist> pi=qe.list();
		tx.commit();
		if(!pi.isEmpty()) {
			return pi;
		}
		else
			return null;
	}	
	
	
	public static List<Pathologist> viewPathologists()
	{
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from Pathologist p");
		List<Pathologist> pi=qe.list();
		tx.commit();
		if(!pi.isEmpty()) {
			return pi;
		}
		else
			return null;
		
	}

	
	
	public static List<Pathologist> search(String specialisation,String doctor_name)
	{
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from Pathologist p where (p.doctor_specialisation=:x) or (p.doctor_name=:y)");
		qe.setParameter("x",specialisation);
		qe.setParameter("y",doctor_name);
		List<Pathologist> pi=qe.list();
		tx.commit();
		if(!pi.isEmpty()) {
			return pi;
		}
		else
			return null;		
	}
	
}
