package com.mlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagerRegisterBean 
{
private int mid,age,salary;
private String name,email,password,phone,department,gender,experience;

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

	public boolean register(String name, String email, String password, String phone, String department, String gender,	int age, int salary, String experience) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("insert into manager(name,email,password,phone,department,gender,age,salary,experience) values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, phone);
		ps.setString(5, department);
		ps.setString(6, gender);
		ps.setInt(7,age);
		ps.setInt(8, salary);
		ps.setString(9, experience);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
	
	
}
