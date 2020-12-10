package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViewAppointmentBean {
	private int aid,pid;
	private String patient_name,phone,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment,status,doctor_name;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getDate_of_appointment() {
		return date_of_appointment;
	}
	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	public String getTime_of_appointment() {
		return time_of_appointment;
	}
	public void setTime_of_appointment(String time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public List<ViewAppointmentBean> appointmentList(String specialist) throws SQLException, ClassNotFoundException{
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("select * from appointment where specialist=?");
		ps.setString(1, specialist);
		ResultSet rs=ps.executeQuery();
		ArrayList<ViewAppointmentBean> Alist=new ArrayList<>();
		while(rs.next())
		{
			ViewAppointmentBean va=new ViewAppointmentBean();
			va.setAid(rs.getInt(1));
			va.setPatient_name(rs.getString(2));
			va.setPhone(rs.getString(3));
			va.setEmail(rs.getString(4));
			va.setGender(rs.getString(5));
			va.setBlood_group(rs.getString(6));
			va.setSpecialist(rs.getString(7));
			va.setDate_of_appointment(rs.getString(8));
			va.setTime_of_appointment(rs.getString(9));
			va.setStatus(rs.getString(10));
			va.setDoctor_name(rs.getString(11));
			va.setPid(rs.getInt(12));
			Alist.add(va);
		}
		
		return Alist;		
	}
}
