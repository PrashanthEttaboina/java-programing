package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoctorRegisterBean {
	private int id;
	private String dname,password,email,phone,specialisation,date_of_birth,timings,experience;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public boolean register(String dname,String email,String password,String phone,String specialisation,String date_of_birth,String timings,String experience) throws ClassNotFoundException, SQLException {
	
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("insert into doctor (dname,password,email,phone,specialisation,date_of_birth,timings,experience) values(?,?,?,?,?,?,?,?)");
		ps.setString(1,dname);
		ps.setString(2,password);
		ps.setString(3,email);
		ps.setString(4,phone);
		ps.setString(5,specialisation);
		ps.setString(6,date_of_birth);
		ps.setString(7,timings);
		ps.setString(8,experience);	
		
		int x=ps.executeUpdate();
		if(x!=0)
				return true;
		else
			return false;
	}
	
}
