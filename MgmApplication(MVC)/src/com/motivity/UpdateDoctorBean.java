package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateDoctorBean {
	private int doctor_id;
	private String dname,email,phone,specialisation,date_of_birth,timings,experience;
	public int getId() {
		return doctor_id;
	}
	public void setId(int id) {
		this.doctor_id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
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

	public DoctorRegisterBean update(String dname,String email,String phone,String specialisation,String date_of_birth,String timings,String experience,int doctor_id) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("update doctor set dname=?,email=?,phone=?,specialisation=?,date_of_birth=?,timings=?,experience=? where doctor_id=?");
		ps.setString(1,dname);
		ps.setString(2,email);
		ps.setString(3,phone);
		ps.setString(4,specialisation);
		ps.setString(5,date_of_birth);
		ps.setString(6,timings);
		ps.setString(7,experience);	
		ps.setInt(8, doctor_id);
		
		int x=ps.executeUpdate();
		DoctorRegisterBean dr=new DoctorRegisterBean();
		if(x!=0)
		{
			ps=con.prepareStatement("select * from doctor where doctor_id=?");
			ps.setInt(1, doctor_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				dr.setId(doctor_id);
				dr.setDname(dname);
				dr.setEmail(email);
				dr.setPhone(phone);
				dr.setSpecialisation(specialisation);
				dr.setDate_of_birth(date_of_birth);
				dr.setTimings(timings);
				dr.setExperience(experience);
				return dr;
			}
			else 
				return null;
		}
		else
			return null;
	}
}
