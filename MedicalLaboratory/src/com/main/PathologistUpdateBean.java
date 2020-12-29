package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Pathologist;

public class PathologistUpdateBean {

	public static boolean update(Pathologist path) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		se.update(path);
		tx.commit();
		
			return true;
		
	}

}
