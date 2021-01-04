package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.UrineTest;

public class UrineReportBean {

	public static boolean report(UrineTest bt) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		se.merge(bt);
		tx.commit();
		
			return true;
	}
}
