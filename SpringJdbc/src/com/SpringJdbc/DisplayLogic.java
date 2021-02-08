package com.SpringJdbc;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;

public class DisplayLogic {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void display() {
	List pirate=jdbcTemplate.queryForList("select * from pirates");
	
	Iterator it =pirate.iterator();
		
		while(it.hasNext())
		{
			Map<String,String> m=(Map<String, String>) it.next();
			Object[] s= m.values().toArray();
		
			for(Object value:s)
				System.out.print(value+" ");
			
			System.out.println();
		}
		
	}

}
