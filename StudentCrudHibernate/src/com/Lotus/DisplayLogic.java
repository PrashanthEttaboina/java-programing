package com.Lotus;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DisplayLogic {

	public static void display() {
		
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		Transaction ts=se.beginTransaction();
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Enter your choice \n 1.Retrieve all records \n 2. Retrieve sinlge Record ");
		if(sc.nextInt()==1)
		{
			Query qr=se.createQuery("from StudentDetails s");
			List<StudentDetails> l=qr.list();
			Iterator<StudentDetails> i=l.iterator();
			while(i.hasNext())
			{
				StudentDetails sd=i.next();
				System.out.println("Student id="+sd.getId()+"\nStudent Name= "+sd.getName()+"\nMarks= "+sd.getMarks()+"\nAddress= "+sd.getAddress()+"\nParent Name= "+sd.getParent_name());	
			}
		}
		else if(sc.nextInt()==2)
		{
			System.out.println("Enter the id of the record you want to retrieve");
			int x=sc.nextInt();
			StudentDetails s=se.load(StudentDetails.class, x);
			System.out.println("Student id="+s.getId()+"\nStudent Name= "+s.getName()+"\nMarks= "+s.getMarks()+"\nAddress= "+s.getAddress()+"\nParent Name= "+s.getParent_name());
		
		}
		System.out.println("Do you want to continue the retriving process ? (y/n)");
		
		}while(sc.next().equalsIgnoreCase("y"));
		
	}

}
