package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Appointment extends HttpServlet 
{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String patient_name=request.getParameter("patient_name");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String blood_group=request.getParameter("blood_group");
		String specialist=request.getParameter("specialist");
		String date_of_appointment=request.getParameter("date_of_appointment");
		String time_of_appointment=request.getParameter("time_of_appointment");
		
		HttpSession hs=request.getSession();
		int pid=(Integer)hs.getAttribute("id");
		boolean status=false;
		
		try {
			status = new AppointmentBean().appoint(patient_name,phone,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment,pid);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
			
		if(status)
			response.sendRedirect("Patient_Home.html?msg=applied successfully");
		else
			response.sendRedirect("appointment.jsp?msg=application failed");
	}

}
