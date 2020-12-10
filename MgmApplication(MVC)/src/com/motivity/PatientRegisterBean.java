package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientRegisterBean {
	private int patient_id,age;
	private String name,password,email,phone,gender,prescription,blood_group;
	
	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public boolean register(String name,String email,String password,String phone,int age,String gender,String prescription,String blood_group) throws ClassNotFoundException, SQLException {
	
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("insert into patient (name,password,email,phone,age,gender,prescription,blood_group) values(?,?,?,?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,password);
		ps.setString(3,email);
		ps.setString(4,phone);
		ps.setInt(5,age);
		ps.setString(6,gender);
		ps.setString(7,prescription);
		ps.setString(8,blood_group);	
		
		int x=ps.executeUpdate();
		if(x!=0)
				return true;
		else
			return false;
	}

	
	
}
