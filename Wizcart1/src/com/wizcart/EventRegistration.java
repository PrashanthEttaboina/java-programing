package com.wizcart;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024*1024*2,maxFileSize = 1024*1024*10,maxRequestSize = 1024*1024*50)
public class EventRegistration extends HttpServlet {
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
		
		Part part=request.getPart("file");
		String fileName = FileUpload.getFileNames(part);
		String path=request.getServletContext().getInitParameter("file-upload");
		String savePath =path+File.separator+fileName;
		File fileSaveDir =new File(savePath);
		part.write(savePath+File.separator);
		
		String rname=request.getParameter("rname");
		String branch=request.getParameter("branch");
		String rollno=request.getParameter("rollno");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String ename=request.getParameter("ename");
		int feid=Integer.parseInt(request.getParameter("feid"));
		String datetime=request.getParameter("datetime");
		String coordinatorname=request.getParameter("coordinatorname");
		HttpSession hs=request.getSession();
		ResultSet rs=(ResultSet)hs.getAttribute("student");

		String sql="insert into eventregister(rname,branch,rollno,phone,email,ename,filename,datetime,feid,ticket,coordinatorname) values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, rname);
			ps.setString(2, branch);
			ps.setString(3, rollno);
			ps.setString(4, phone);
			ps.setString(5, email);
			ps.setString(6, ename);
			ps.setString(7, fileName);
			ps.setString(8, datetime);
			ps.setInt(9, feid);
			ps.setString(10, "ticket generated");
			ps.setString(11, coordinatorname);
			int a=ps.executeUpdate();
			if(a!=0) {
				hs.setAttribute("student", rs);
				response.sendRedirect("./student_home.jsp?msg=Event registered sucessfully");
			}
			else
				response.sendRedirect("./event_register.jsp?ename="+ename+"&msg=registered failed");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
