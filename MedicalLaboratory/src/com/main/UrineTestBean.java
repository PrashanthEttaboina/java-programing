package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.BloodTest;
import com.pojo.UrineTest;


public class UrineTestBean {

	public static List<UrineTest> viewUrineTests()
	{
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from UrineTest u"); //for pathologist to view all appointments
		List<UrineTest> bi=qe.list();
		tx.commit();
		if(!bi.isEmpty()) {
			return bi;
		}
		else
			return null;	
	}
	
	public static List<UrineTest> searchById(int id) //for pathologist to update report 
	{
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from UrineTest u where u.uid=:x");
		qe.setParameter("x", id);
		List<UrineTest> bi=qe.list();
		tx.commit();
		if(!bi.isEmpty()) {
			return bi;
		}
		else
			return null;	
	}
	
	public static List<UrineTest> getByPatientId(int id) //for patient personal test report 
	{
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from UrineTest u where u.pat_id=:x");
		qe.setParameter("x", id);
		List<UrineTest> bi=qe.list();
		tx.commit();
		if(!bi.isEmpty()) {
			return bi;
		}
		else
			return null;	
	}
	
	public static List<UrineTest> searchAdmin(String patient_name,String test_type) //for Admin Search
	{
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
	
		Query qe=se.createQuery("from UrineTest u where u.patient_name=:x");
		qe.setParameter("x",patient_name);
		List<UrineTest> bi=qe.list();
		tx.commit();
		if(!bi.isEmpty()) {
			return bi;
		}
		else
			return null;	
	}
}
