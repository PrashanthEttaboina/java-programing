package com.cars;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String args[])
	{
		
	Session se=Config.config();
	
	Transaction tx=se.beginTransaction();	
	
	Customer c1=new Customer();
	c1.setCustomer_id(1205);
	c1.setCustomer_name("vasanth");
	
	Customer c2=new Customer();
	c2.setCustomer_id(1206);
	c2.setCustomer_name("Sunil");
	
	Company com1=new Company();
	com1.setCompany_id(2);
	com1.setCompany_name("Suzuki");
	
	Set<Customer> s=new HashSet<Customer>();
	s.add(c1);
	s.add(c2);

	com1.setCustomer(s);
	
	se.save(com1);

	tx.commit();
	
	
	}
	
}

