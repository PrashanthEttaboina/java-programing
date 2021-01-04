package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.UrineTest;

public class ApplyUrineTestBean {

	public static boolean apply(UrineTest bt) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Object o= se.save(bt);
		tx.commit();
		if(o!=null) {
			return true;
		}
		return false;
	}

}
