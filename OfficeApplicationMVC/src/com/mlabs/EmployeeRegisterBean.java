package com.mlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRegisterBean {
	private int emp_id, salary;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	private String name,email,password,phone,department,designation,gender,date_of_joining;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	
	public boolean register(String name,String email,String password,String phone,String department,
			String designation,String gender,int salary,String date_of_joining) throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("insert into employee(name,email,password,phone,department,designation,gender,salary,date_of_joining) values(?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, phone);
		ps.setString(5,department);
		ps.setString(6, designation);
		ps.setString(7, gender);
		ps.setInt(8, salary);
		ps.setString(9, date_of_joining);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;	
	}
	
	
}
