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

public class PatientRegister extends HttpServlet {

	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config)  {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/mgm";
		String username="root";
		String password="root";
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		String age=request.getParameter("age");
		int Age=Integer.parseInt(age);
		String gender=request.getParameter("gender");
		String prescription=request.getParameter("prescription");
		String bloodgroup=request.getParameter("blood_group");
		
		PrintWriter pw=response.getWriter();
		
		String sql="insert into patient (name,email,password,phone,age,gender,prescription,blood_group) values(?,?,?,?,?,?,?,?)";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,password);
			ps.setString(4,phone);
			ps.setInt(5,Age);
			ps.setString(6,gender);
			ps.setString(7,prescription);
			ps.setString(8,bloodgroup);
			
			pw.println("<html><body bgcolor='lightskyblue'><center><h1> ");
			int x=ps.executeUpdate();
			if(x!=0)
			{
				pw.println("Patient Registered Successfully");
			}
			else
				pw.println("Registration Failed");
			pw.println("</h1></center></body></html>");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
