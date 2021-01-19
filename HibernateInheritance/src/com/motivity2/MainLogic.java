package com.motivity2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration1.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();

		Transaction tx=se.beginTransaction();	
		
		
		Cheque2 c=new Cheque2();
		c.setPayment_id(102);
		c.setAmount(15000);
		c.setChequetype("SBI");
		
		CreditCard2 cc=new CreditCard2();
		cc.setPayment_id(103);
		cc.setAmount(150000);
		cc.setCctype("ICICI");
		se.save(cc);
		
		se.save(c);
		tx.commit();

	}

}
