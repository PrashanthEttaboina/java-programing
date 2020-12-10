package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorLoginBean {

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
	
	
public DoctorRegisterBean loginValidate(String email,String password) throws ClassNotFoundException, SQLException 	{
	Connection con=ConnectionEst.connectivity();
	PreparedStatement ps= con.prepareStatement("select * from doctor where email=? and password=?");
	ps.setString(1, email);
	ps.setString(2, password);
	ResultSet rs=ps.executeQuery();
	DoctorRegisterBean dr=new DoctorRegisterBean();
	if(rs.next())
	{
		dr.setId(rs.getInt("doctor_id"));
		dr.setDname(rs.getString("dname"));
		dr.setEmail(email);
		dr.setPassword(password);
		dr.setPhone(rs.getString("phone"));
		dr.setSpecialisation(rs.getString("specialisation"));
		dr.setDate_of_birth(rs.getString("date_of_birth"));
		dr.setTimings(rs.getString("timings"));
		dr.setExperience(rs.getString("experience"));
		return dr;
	}
	else
		return null;
}
}
