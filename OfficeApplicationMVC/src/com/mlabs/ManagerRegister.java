package com.mlabs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManagerRegister extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		String department=request.getParameter("department");
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		int salary=Integer.parseInt(request.getParameter("salary"));
		String experience=request.getParameter("experience");
		
		boolean status=false;
		ManagerRegisterBean mr=new ManagerRegisterBean();
		
		mr.setName(name);
		mr.setEmail(email);
		mr.setPassword(password);
		mr.setPhone(phone);
		mr.setDepartment(department);
		mr.setGender(gender);
		mr.setAge(age);
		mr.setSalary(salary);
		mr.setExperience(experience);

		try {
			status=mr.register(name, email, password, phone, department,gender,age,salary,experience);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		if(status)
			response.sendRedirect("Manager_Login.html?msg=Registration Successful");
		else
			response.sendRedirect("Manager_Registration.html?msg=Registration failed");
	}
	
}