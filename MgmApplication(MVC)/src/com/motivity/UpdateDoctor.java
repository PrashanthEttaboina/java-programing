package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateDoctor extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int doctor_id=Integer.parseInt(request.getParameter("doctor_id"));
		String dname=request.getParameter("dname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String specialisation=request.getParameter("specialisation");
		String date_of_birth=request.getParameter("date_of_birth");
		String timings=request.getParameter("timings");
		String experience=request.getParameter("experience");
		
		UpdateDoctorBean ud=new UpdateDoctorBean();
		ud.setId(doctor_id);
		ud.setDname(dname);
		ud.setEmail(email);
		ud.setPhone(phone);
		ud.setSpecialisation(specialisation);
		ud.setDate_of_birth(date_of_birth);
		ud.setTimings(timings);
		ud.setExperience(experience);
		
		HttpSession hs=request.getSession();
		DoctorRegisterBean dr=null;
		
		try {
			dr=ud.update(dname, email, phone, specialisation, date_of_birth, timings, experience, doctor_id);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(dr!=null)
		{
			hs.setAttribute("doctorDetails",dr);
			response.sendRedirect("./doctor_profile.jsp?msg=profile updated");
		}
		else
			response.sendRedirect("./update_doctor_profile.jsp?msg=update failed");
	}
}
