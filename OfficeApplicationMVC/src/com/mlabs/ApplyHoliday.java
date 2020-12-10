package com.mlabs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplyHoliday extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String department=request.getParameter("department");
		int no_of_holidays=Integer.parseInt(request.getParameter("no_of_holidays"));
		String holiday_begin_date=request.getParameter("holiday_begin_date");
		
		boolean status=false;
		
		try {
			status=new ApplyHolidayBean().apply(name,email,phone,department,no_of_holidays,holiday_begin_date);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(status)
			response.sendRedirect("Employee_Home.html?msg=applied successfully");
		else
			response.sendRedirect("apply_holiday.jsp?msg=application failed");
	}
}
