package com.wizcart;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GiveFeedback extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config){
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/wizcart";
		String username="root";
		String password="root";
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String feedback=request.getParameter("feedback");
		int rating=Integer.parseInt(request.getParameter("rating"));
		String suggestions=request.getParameter("suggestions");
		String ename=request.getParameter("ename");
		String personname=request.getParameter("personname");
		int feid=Integer.parseInt(request.getParameter("feid"));
		String coordinatorname=request.getParameter("coordinatorname");
		String datetime=request.getParameter("datetime");
		
		String rollnumber =request.getParameter("rollnumber");
		
		String sql="insert into feedback(feedback,rating,suggestions,ename,personname,feid,coordinatorname,datetime,rollnumber) values(?,?,?,?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, feedback);
			ps.setInt(2, rating);
			ps.setString(3, suggestions);
			ps.setString(4, ename);
			ps.setString(5, personname);
			ps.setInt(6, feid);
			ps.setString(7, coordinatorname);
			ps.setString(8, datetime);
			ps.setString(9, rollnumber);
			int a=ps.executeUpdate();
			if(a!=0)
			{
				String s="update eventRegister set feedback=? where feid=?";
				ps=con.prepareStatement(s);
				ps.setString(1, "added");
				ps.setInt(2, feid);
				int b=ps.executeUpdate();
				if(b!=0)
				{
					System.out.println("given feedback ");
				}
				else
					System.out.println("feedback failed");
				//hs.setAttribute("budget", rs);
				response.sendRedirect("./feedback.jsp?msg=Given Feedback sucessfully");
			}
				else
				{
				
					response.sendRedirect("./feedback.jsp?msg=Feedback failed");
				}
			} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
