package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientLogin extends HttpServlet {

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
		
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		PrintWriter pw=response.getWriter();
		
		String sql="select * from patient where email=? and password=?";
		
		try {
			ps=con.prepareStatement(sql);
		
			ps.setString(1,email);
			ps.setString(2,password);
			HttpSession hs=request.getSession();
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				hs.setAttribute("aid", rs.getString("patient_id"));
				hs.setAttribute("semail",email);
				response.sendRedirect("./Patient_Home.html?msg=Patient Logged in Successfully");
				
			}
			else
				response.sendRedirect("./PatientLogin.html?msg=Patient Login Failed please try again");

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
