package com.mlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateEmployeeBean {
	private int emp_id,salary;
	private String name,email,phone,department,designation,gender,date_of_joining;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

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

	public EmployeeRegisterBean update(String name, String email, String phone, String department,String designation, String gender, int salary, String date_of_joining, int emp_id) throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps= con.prepareStatement("update employee set name=?,email=?,phone=?,department=?,designation=?,gender=?,salary=?,date_of_joining=? where emp_id=? ");
		ps.setString(1,name);
		ps.setString(2, email);
		ps.setString(3, phone);
		ps.setString(4, department);
		ps.setString(5, designation);
		ps.setString(6, gender);
		ps.setInt(7,salary);
		ps.setString(8, date_of_joining);
		ps.setInt(9, emp_id);
		
		int x= ps.executeUpdate();
		EmployeeRegisterBean er=new EmployeeRegisterBean();
		if(x!=0)
		{
			ps=con.prepareStatement("select * from employee where emp_id=?");
			ps.setInt(1, emp_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				er.setEmp_id(emp_id);
				er.setName(name);
				er.setEmail(email);
				er.setPhone(phone);
				er.setDepartment(department);
				er.setDesignation(designation);
				er.setGender(gender);
				er.setSalary(salary);
				er.setDate_of_joining(date_of_joining);
				return er;
			}
			else 
				return null;
		}
		return null;
	}	
}
