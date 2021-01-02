package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.BloodTest;

public class BloodReportBean {

	public static boolean report(BloodTest bt) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		se.merge(bt);
		tx.commit();
		
			return true;
	}
}
