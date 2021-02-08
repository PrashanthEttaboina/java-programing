package com.annotations;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {
		
		
		Session se=Config.config();

		Transaction tx=se.beginTransaction();	
		
		
		Cheque c=new Cheque();
		c.setPid(102);
		c.setAmount(15000);
		c.setChequetype("ICICI");
		
		CreditCard cc=new CreditCard();
		cc.setPid(103);
		cc.setAmount(150000);
		cc.setCctype("MASTER CARD");
		
		se.save(cc);
		
		se.save(c);
		tx.commit();

	}
}
