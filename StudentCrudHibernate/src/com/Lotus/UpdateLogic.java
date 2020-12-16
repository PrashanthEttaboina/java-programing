package com.Lotus;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateLogic {

	public static void update() {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();

		Scanner sc=new Scanner(System.in);
		int option=0,x=0;
		String choice="";
		do {
			Transaction tx=se.beginTransaction();
			System.out.println("Enter the option you want to update \n1.Name \n2.Marks \n3.Address \n4.Parent Name ");
			option=sc.nextInt();
			if(option==1)
			{
				Query qr=se.createQuery("update StudentDetails s set s.name=:x where s.id=:y");
				System.out.println("Enter the id where you want to update the name ");
				qr.setParameter("y",sc.nextInt());
				System.out.println("Enter new name :");
				qr.setParameter("x",sc.next());
				x = qr.executeUpdate();
				if (x>0)
					System.out.println("Record updated");		
			}
			else if(option==2)
			{
				Query qr=se.createQuery("update StudentDetails s set s.marks=:x where s.id=:y");
				System.out.println("Enter the id where you want to update marks");
				qr.setParameter("y",sc.nextInt());
				System.out.println("Enter new marks");
				qr.setParameter("x", sc.nextInt());
				x=qr.executeUpdate();
				if(x>0)
					System.out.println("Record updated");
			}
			else if(option==3)
			{
				Query qr=se.createQuery("update StudentDetails s set s.address=:x where s.id=:y");
				System.out.println("Enter the id where you want to update address");
				qr.setParameter("y",sc.nextInt());
				System.out.println("Enter new address");
				qr.setParameter("x", sc.next());
				x=qr.executeUpdate();
				if(x>0)
					System.out.println("Record updated");
			}
			else if(option==4)
			{
				Query qr=se.createQuery("update StudentDetails s set s.parent_name=:x where s.id=:y");
				System.out.println("Enter the id where you want to update parent name ");
				qr.setParameter("y",sc.nextInt());
				System.out.println("Enter parent name");
				qr.setParameter("x", sc.next());
				x=qr.executeUpdate();
				if(x>0)
					System.out.println("Record updated");	
			}
			tx.commit();
			System.out.println("Do you want to continue the update procedure ?(y/n)");
		}while(sc.next().equalsIgnoreCase("y"));
		
	}

}
