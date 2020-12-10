package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientRegister extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String dname=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String prescription=request.getParameter("prescription");
		String blood_group=request.getParameter("blood_group");
		
		boolean status=false;
		PatientRegisterBean pr=new PatientRegisterBean();
		
		pr.setName(dname);
		pr.setPassword(password);
		pr.setEmail(email);
		pr.setPhone(phone);
		pr.setAge(age);
		pr.setGender(gender);
		pr.setPrescription(prescription);
		pr.setBlood_group(blood_group);
		
		try {
			status=pr.register(dname,email,password,phone,age,gender,prescription,blood_group);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./PatientLogin.html?msg=Doctor Registered successfully");
		else
			response.sendRedirect("/.PatientRegister.html?msg=Registration failed");
		
	}

}
