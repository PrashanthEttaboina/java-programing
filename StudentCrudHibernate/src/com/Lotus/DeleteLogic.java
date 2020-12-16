package com.Lotus;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteLogic {

	public static void delete() {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		Transaction ts=se.beginTransaction();
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Select what you want to delete \n1.Single Record \n2.All Records");
			if(sc.nextInt()==1)
			{
				do
				{	
				Query qr=se.createQuery("delete from StudentDetails s where s.id=:x");
				System.out.println("Enter the id of the student whose record to be deleted ");
				qr.setParameter("x",sc.nextInt());
				int y=qr.executeUpdate();
				if(y>0)
					System.out.println("Record deleted");
				
				System.out.println("Do you want to continue the deleting process ?(y/n)");
				ts.commit();
				}while(sc.next().equalsIgnoreCase("y"));
			}
			else if (sc.nextInt()==2)
			{
				Query qr=se.createQuery("delete from StudentDetails s");
				int x = qr.executeUpdate();
				ts.commit();
				if (x>0)
					System.out.println("All the Records are deleted");
			}		
	}

}
