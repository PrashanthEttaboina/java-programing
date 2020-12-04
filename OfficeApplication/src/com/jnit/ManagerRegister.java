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

public class ManagerRegister extends HttpServlet {
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
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		int salary=Integer.parseInt(request.getParameter("salary"));
		String experience=request.getParameter("experience");
		PrintWriter pw=response.getWriter();
		
		String sql="insert into manager(name,email,password,phone,department,gender,age,salary,experience) values(?,?,?,?,?,?,?,?,?)";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,password);
			ps.setString(4,phone);
			ps.setString(5,department);
			ps.setString(6,gender);
			ps.setInt(7,age);
			ps.setInt(8,salary);
			ps.setString(9, experience);
			
			pw.println("<html><body bgcolor='lightskyblue'><center><h1> ");
			int x=ps.executeUpdate();
			if(x!=0)
			{
				pw.println("Manager Registered Successfully");
			}
			else
				pw.println("Manager Registration Failed");
			
			pw.println("</h1></center></body></html>");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	

}
