package com.mlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeLoginBean {
	
	private String email,password;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EmployeeRegisterBean loginValidate(String email, String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps= con.prepareStatement("select * from employee where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		EmployeeRegisterBean er=new EmployeeRegisterBean();
		if(rs.next())
		{
			er.setEmp_id(rs.getInt("emp_id"));
			er.setName(rs.getString("name"));
			er.setEmail(email);
			er.setPassword(password);
			er.setPhone(rs.getString("phone"));
			er.setDepartment(rs.getString("department"));
			er.setDesignation(rs.getString("designation"));
			er.setGender(rs.getString("gender"));
			er.setSalary(rs.getInt("salary"));
			er.setDate_of_joining(rs.getString("date_of_joining"));
			 
			return er;
			
		}
		else
			return null;
	}

	

}
