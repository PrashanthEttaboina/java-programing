package NamedJdbcTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class UpdateLogic {

	NamedParameterJdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.jdbcTemplate = namedParameterJdbcTemplate;
	}

	public void update() {
		
		Scanner sc=new Scanner(System.in);
		int option=0,x=0;
		
		do {
			
			System.out.println("Enter the option you want to update \n1.Pirate Name \n2.Father name \n3.Job \n4.Bounty \n5.Crew ");
			option=sc.nextInt();
			if(option==1)
			{
				String qr="update pirates set name=:x where sid=:y";
				System.out.println("Enter new name :");
				String name=sc.nextLine();
				System.out.println("Enter the id where you want to update name ");
				int id=sc.nextInt();
				updatequery(qr,id,name);
					
			}
			else if(option==2)
			{
				String qr="update pirates set fathername=:x where sid=:y";
				System.out.println("Enter the id where you want to update Father name ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new name :");
				String name=sc.nextLine();
				updatequery(qr,id,name);
			}
			else if(option==3)
			{
				String qr="update pirates set job=:x where sid=:y";
				System.out.println("Enter the id where you want to update Job ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new job :");
				String job=sc.nextLine();
				updatequery(qr,id,job);
			}
			else if(option==4)
			{
				String qr="update pirates set bounty=:x where sid=:y";
				System.out.println("Enter the id where you want to update Bounty ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new Bounty :");
				String bounty=sc.nextLine();
				updatequery(qr,id,bounty);
			}
			else if(option==5)
			{
				String qr="update pirates set crew_name=:x where sid=:y";
				System.out.println("Enter the id where you want to update Crew ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new Crew :");
				String crew=sc.nextLine();
				updatequery(qr,id,crew);
			}
			System.out.println("Do you want to continue the update procedure ?(y/n)");
		}while(sc.next().equalsIgnoreCase("y"));
		
	}

	private void updatequery(String qr, int id, String name) {
		
		Map<String,Object> map=new HashMap<>();
		map.put("x", name);
		map.put("y", id);
		int x=jdbcTemplate.update(qr,map);
		if (x>0)
			System.out.println("Record updated");	
		
	}

}
