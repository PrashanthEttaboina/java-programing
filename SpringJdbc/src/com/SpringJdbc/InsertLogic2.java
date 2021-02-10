package com.SpringJdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;


public class InsertLogic2 {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public  void insert() {
	
		
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
			
			Boolean b=savePirateByPreparedStatement(name,fathername,job,bounty,crew);
			
			
			/*
			 * String
			 * sql="insert into pirates(name,fathername,job,bounty,crew_name) values(?,?,?,?,?)"
			 * ; int i=jdbcTemplate.update(sql, new PreparedStatementSetter() {
			 * 
			 * @Override public void setValues(PreparedStatement ps) throws SQLException {
			 * ps.setString(1,name); ps.setString(2,fathername); ps.setString(3,job);
			 * ps.setString(4,bounty); ps.setString(5,crew);
			 * 
			 * } });
			 */
			
			if(!b)
				System.out.println("record inserted ");
			System.out.println("Do you want to insert more records ?(y/n): ");
			choice = sc.nextLine();
			
		}while(choice.equalsIgnoreCase("y"));
				
	}

	private Boolean savePirateByPreparedStatement(String name, String fathername, String job, String bounty,
			String crew) {
		String query="insert into pirates(name,fathername,job,bounty,crew_name) values(?,?,?,?,?)";  
		   
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setString(1,name);  
	        ps.setString(2,fathername);  
	        ps.setString(3,job);  
			ps.setString(4,bounty);  
		 	ps.setString(5,crew);  
	              
	        return ps.execute();  	              
	    }  
	    });  
		
	}

}
