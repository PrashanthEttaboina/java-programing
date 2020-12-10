package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoctorRegister extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String dname=request.getParameter("dname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String specialisation=request.getParameter("specialisation");
		String date_of_birth=request.getParameter("date_of_birth");
		String timings=request.getParameter("timings");
		String experience=request.getParameter("experience");
		
		boolean status=false;
		DoctorRegisterBean dr=new DoctorRegisterBean();
		
		dr.setDname(dname);
		dr.setPassword(password);
		dr.setEmail(email);
		dr.setPhone(phone);
		dr.setSpecialisation(specialisation);
		dr.setDate_of_birth(date_of_birth);
		dr.setTimings(timings);
		dr.setExperience(experience);
		
		try {
			status=dr.register(dname,email,password,phone,specialisation,date_of_birth,timings,experience);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./DoctorLogin.html?msg=Doctor Registered successfully");
		else
			response.sendRedirect("/.DoctorRegister.html?msg=Registration failed");
		
	}

}
