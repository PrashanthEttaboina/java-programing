package com.Lotus;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertLogic {

	public static void insert() {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();

		Scanner sc=new Scanner(System.in);
		String choice="";
		do {
			Transaction ts=se.beginTransaction();
			StudentDetails sd=new StudentDetails();
			System.out.println("Enter the id of the student : ");
			sd.setId(sc.nextInt());
			System.out.println("Enter the name of the student : ");
			sd.setName(sc.next());
			System.out.println("Enter the marks of the student : ");
			sd.setMarks(sc.nextInt());
			System.out.println("Enter the Address of the student : ");
			sd.setAddress(sc.next());
			System.out.println("Enter the parent name of the student : ");
			sd.setParent_name(sc.next());
			
			int i=(Integer)se.save(sd);
			ts.commit();
			if(i>0)
				System.out.println("record inserted ");
			System.out.println("Do you want to insert more records ?(y/n): ");
			choice = sc.next();
			
		}while(choice.equalsIgnoreCase("y"));
		
	}

}
