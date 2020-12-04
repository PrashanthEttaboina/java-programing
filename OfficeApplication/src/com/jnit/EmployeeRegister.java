package com.jnit;

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

public class EmployeeRegister extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/office";
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
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		String department=request.getParameter("department");
		String designation=request.getParameter("designation");
		String gender=request.getParameter("gender");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String date_of_joining=request.getParameter("date_of_joining");
		PrintWriter pw=response.getWriter();
		
		String sql="insert into employee(name,email,password,phone,department,designation,gender,salary,date_of_joining) values(?,?,?,?,?,?,?,?,?)";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,password);
			ps.setString(4,phone);
			ps.setString(5,department);
			ps.setString(6,designation);
			ps.setString(7,gender);
			ps.setInt(8,salary);
			ps.setString(9, date_of_joining);
			
			pw.println("<html><body bgcolor='lightskyblue'><center><h1> ");
			int x=ps.executeUpdate();
			if(x!=0)
			{
				pw.println("Employee Registered Successfully");
			}
			else
				pw.println("Employee Registration Failed");
			
			pw.println("</h1></center></body></html>");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	

}
