package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientLoginBean {

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
	
	
public PatientRegisterBean loginValidate(String email,String password) throws ClassNotFoundException, SQLException 	{
	Connection con=ConnectionEst.connectivity();
	PreparedStatement ps= con.prepareStatement("select * from patient where email=? and password=?");
	ps.setString(1, email);
	ps.setString(2, password);
	ResultSet rs=ps.executeQuery();
	PatientRegisterBean pr=new PatientRegisterBean();
	if(rs.next())
	{
		pr.setPatient_id(rs.getInt("patient_id"));
		pr.setName(rs.getString("name"));
		pr.setEmail(email);
		pr.setPassword(password);
		pr.setPhone(rs.getString("phone"));
		pr.setAge(rs.getInt("age"));
		pr.setGender(rs.getString("gender"));
		pr.setPrescription(rs.getString("prescription"));
		pr.setBlood_group(rs.getString("blood_group"));
		return pr;
	}
	else
		return null;
}
}
