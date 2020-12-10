package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatePatientBean {
	private int patient_id,age;
	private String name,email,phone,gender,prescription,blood_group;

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public PatientRegisterBean update(String name,String email,String phone,int age,String gender,String prescription,String blood_group,int patient_id) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("update patient set name=?,email=?,phone=?,age=?,gender=?,prescription=?,blood_group=? where patient_id=?");
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,phone);
		ps.setInt(4,age);
		ps.setString(5,gender);
		ps.setString(6,prescription);
		ps.setString(7,blood_group);	
		ps.setInt(8, patient_id);
		
		int x=ps.executeUpdate();
		PatientRegisterBean pr=new PatientRegisterBean();
		if(x!=0)
		{
			ps=con.prepareStatement("select * from patient where patient_id=?");
			ps.setInt(1, patient_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				pr.setPatient_id(patient_id);
				pr.setName(name);
				pr.setEmail(email);
				pr.setPhone(phone);
				pr.setAge(age);
				pr.setGender(gender);
				pr.setPrescription(prescription);
				pr.setBlood_group(blood_group);
				return pr;
			}
			else 
				return null;
		}
		else
			return null;
	}
}
