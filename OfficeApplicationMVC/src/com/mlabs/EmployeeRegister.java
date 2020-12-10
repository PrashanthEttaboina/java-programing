package com.mlabs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeRegister extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		String department=request.getParameter("department");
		String designation=request.getParameter("designation");
		String gender=request.getParameter("gender");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String date_of_joining=request.getParameter("date_of_joining");
		
		boolean status=false;
		EmployeeRegisterBean er=new EmployeeRegisterBean();
		
		er.setName(name);
		er.setEmail(email);
		er.setPassword(password);
		er.setPhone(phone);
		er.setDepartment(department);
		er.setDesignation(designation);
		er.setGender(gender);
		er.setSalary(salary);
		er.setDate_of_joining(date_of_joining);
		
		try {
			status=er.register(name, email, password, phone, department, designation, gender, salary, date_of_joining);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		if(status)
			response.sendRedirect("Employee_Login.html?msg=Registration Successful");
		else
			response.sendRedirect("Employee_Registration.html?msg=Registration failed");
	}
	
}