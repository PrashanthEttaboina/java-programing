package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.BloodTest;


public class BloodTestBean {

	public static List<BloodTest> viewBloodTests()
	{
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from BloodTest b"); //for pathologist to view all appointments
		List<BloodTest> bi=qe.list();
		tx.commit();
		if(!bi.isEmpty()) {
			return bi;
		}
		else
			return null;	
	}
	
	public static List<BloodTest> searchById(int id) //for pathologist to update report 
	{
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from BloodTest b where b.bid=:x");
		qe.setParameter("x", id);
		List<BloodTest> bi=qe.list();
		tx.commit();
		if(!bi.isEmpty()) {
			return bi;
		}
		else
			return null;	
	}
	
	public static List<BloodTest> getByPatientId(int id) //for patient personal test report 
	{
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from BloodTest b where b.pat_id=:x");
		qe.setParameter("x", id);
		List<BloodTest> bi=qe.list();
		tx.commit();
		if(!bi.isEmpty()) {
			return bi;
		}
		else
			return null;	
	}
}
