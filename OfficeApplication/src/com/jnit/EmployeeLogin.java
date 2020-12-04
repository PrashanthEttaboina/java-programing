package com.jnit;

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

public class EmployeeLogin extends HttpServlet {

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
		
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		PrintWriter pw=response.getWriter();
		
		String sql="select * from employee where email=? and password=?";
		
		try {
			ps=con.prepareStatement(sql);
		
			ps.setString(1,email);
			ps.setString(2,password);
			HttpSession hs=request.getSession();
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				hs.setAttribute("id",rs.getString("emp_id"));
				hs.setAttribute("semail",email);
				hs.setAttribute("name",rs.getString("name"));
				hs.setAttribute("department",rs.getString("department"));
				response.sendRedirect("./Employee_Home.html?msg=Employee Logged in Successfully");
			}
			else
				response.sendRedirect("./Employee_Login.html?msg=Employee Login Failed please try again");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
