package com.main;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pojo.Pathologist;

public class PathologistLoginBean {

	public static Pathologist login(String email, String password) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query q=se.createQuery("from Pathologist p where p.doctor_email=:x and p.doctor_password=:y");
		q.setParameter("x", email);
		q.setParameter("y", password);
		List<Pathologist> l=q.list();
		tx.commit();
		if (l.size() == 1) {
			Pathologist p1 = l.get(0);
			return p1;
		}
		return null;
	}
	

}
