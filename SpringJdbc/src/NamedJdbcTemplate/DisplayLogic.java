package NamedJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class DisplayLogic {

	NamedParameterJdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.jdbcTemplate = namedParameterJdbcTemplate;
	}

	/*
	 * public void display() {
	 * 
	 * getAllPirates();
	 * 
	 * }
	 */
	public List display(){  
		 return jdbcTemplate.query("select * from pirates",new ResultSetExtractor<List>(){  
		    @Override  
		     public List<String> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException { 
		    	List<String> li=new ArrayList<String>();
		    	
		    	while(rs.next())
		    	{
		    	System.out.print(rs.getString(1)+" ");
		    	System.out.print(rs.getString(2)+" ");
		    	System.out.print(rs.getString(3)+" ");
		    	System.out.print(rs.getString(4)+" ");
		    	System.out.print(rs.getString(5)+" ");
		    	System.out.println();
		    	}		    	
		            return li;  
		            }  
		        });  
		      }  			
	}