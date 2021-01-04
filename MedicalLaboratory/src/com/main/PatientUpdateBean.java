package com.main;

import com.pojo.Patient;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class PatientUpdateBean {

	public static boolean update(Patient pat) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		se.update(pat);
		tx.commit();
			return true;
		
	}

}
