package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoctorRegister extends HttpServlet {

	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/mgm";
		String username="root";
		String password="root";
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String specialisation=request.getParameter("specialisation");
		String dob=request.getParameter("date_of_birth");
		String timings=request.getParameter("timings");
		String experience=request.getParameter("experience");
		
		PrintWriter pw=response.getWriter();
		
		String sql="insert into doctor (name,password,email,phone,specialisation,date_of_birth,timings,experience) values(?,?,?,?,?,?,?,?)";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setString(4,phone);
			ps.setString(5,specialisation);
			ps.setString(6,dob);
			ps.setString(7,timings);
			ps.setString(8,experience);
			
			pw.println("<html><body bgcolor='lightskyblue'><center><h1> ");
			int x=ps.executeUpdate();
			if(x!=0)
			{
				pw.println("Doctor Registered Successfully");
			}
			else
				pw.println("Registration Failed");
			
			pw.println("</h1></center></body></html>");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
