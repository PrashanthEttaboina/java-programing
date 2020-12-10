package com.mlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateManagerBean {
	private int mid,age,salary;
	private String name,email,phone,department,gender,experience;

		public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

		public ManagerRegisterBean update(String name, String email, String phone, String department,String gender,int age, int salary, String experience, int mid) throws ClassNotFoundException, SQLException
		{
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps= con.prepareStatement("update manager set name=?,email=?,phone=?,department=?,gender=?,age=?,salary=?,experience=? where mid=? ");
		ps.setString(1,name);
		ps.setString(2, email);
		ps.setString(3, phone);
		ps.setString(4, department);
		ps.setString(5, gender);
		ps.setInt(6, age);
		ps.setInt(7,salary);
		ps.setString(8, experience);
		ps.setInt(9, mid);
		
		int x= ps.executeUpdate();
		ManagerRegisterBean mr=new ManagerRegisterBean();
		if(x!=0)
		{
			ps=con.prepareStatement("select * from manager where mid=?");
			ps.setInt(1, mid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				mr.setMid(mid);
				mr.setName(name);
				mr.setEmail(email);
				mr.setPhone(phone);
				mr.setDepartment(department);			
				mr.setGender(gender);
				mr.setAge(age);
				mr.setSalary(salary);
				mr.setExperience(experience);
				return mr;
			}
			else 
				return null;
		}
		return null;
	}	
}
