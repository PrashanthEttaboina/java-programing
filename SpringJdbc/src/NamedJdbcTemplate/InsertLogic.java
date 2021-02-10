package NamedJdbcTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


public class InsertLogic {

	NamedParameterJdbcTemplate jdbcTemplate;

	public void setJdbcTemplate	(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.jdbcTemplate = namedParameterJdbcTemplate;
	}
	 	
	public void insert() {
	
		
		Scanner sc=new Scanner(System.in);
		String choice="";
		do {
			
			System.out.println("Enter the name of the Pirate : ");
			String name=sc.nextLine();
			System.out.println("Enter the Father name of the pirate : ");
			String fathername=sc.nextLine();
			System.out.println("Enter the Job of the Priate : ");
			String job=sc.nextLine();
			System.out.println("Enter the Bounty of the Pirate : ");
			String bounty=sc.nextLine();
			System.out.println("Enter the Crew name  of the Pirate : ");
			String crew=sc.nextLine();
			
			String sql="insert into pirates(name,fathername,job,bounty,crew_name) values(:a,:b,:c,:d,:e)";
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("a", name);
			map.put("b", fathername);
			map.put("c", job);
			map.put("d", bounty);			
			map.put("e", crew);
			
			int i= jdbcTemplate.update(sql,map);
			if(i>0)
				System.out.println("record inserted ");
			System.out.println("Do you want to insert more records ?(y/n): ");
			choice = sc.nextLine();
			
		}while(choice.equalsIgnoreCase("y"));
						
	}



	
}
