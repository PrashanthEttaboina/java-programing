package com.mlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerLoginBean {
	
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

	public ManagerRegisterBean loginValidate(String email, String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps= con.prepareStatement("select * from manager where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		ManagerRegisterBean mr=new ManagerRegisterBean();
		if(rs.next())
		{
			mr.setMid(rs.getInt("mid"));
			mr.setName(rs.getString("name"));
			mr.setEmail(email);
			mr.setPassword(password);
			mr.setPhone(rs.getString("phone"));
			mr.setDepartment(rs.getString("department"));
			mr.setGender(rs.getString("gender"));
			mr.setAge(rs.getInt("age"));
			mr.setSalary(rs.getInt("salary"));
			mr.setExperience(rs.getString("experience"));
			 
			return mr;
			
		}
		else
			return null;
	}

	

}
