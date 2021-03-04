package com.wizcart;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024*1024*2,maxFileSize = 1024*1024*10,maxRequestSize = 1024*1024*50)
public class AddEvent extends HttpServlet {
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
		
		String fname=request.getParameter("fname");
		String ename=request.getParameter("ename");
		String datetime=request.getParameter("datetime");
		String venue=request.getParameter("venue");
		String coordinatorname=request.getParameter("coordinatorname");
	
		String description=request.getParameter("description");
		String[] facilityrequired=request.getParameterValues("facilityrequired");
		String fr="";
		for(String s:facilityrequired) {
			fr+=s+",";
		}
		fr=fr.substring(0,fr.length()-1);
		String sql="insert into events(fname,ename,datetime,venue,coordinatorname,facilityrequired,filename,description) values(?,?,?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, fname);
			ps.setString(2, ename);
			ps.setString(3, datetime);
			ps.setString(4, venue);
			ps.setString(5,coordinatorname);
			ps.setString(6, fr);
			ps.setString(7, fileName);
			
			ps.setString(8, description);
			int a=ps.executeUpdate();
			if(a!=0)
				response.sendRedirect("./add_event.jsp?msg=registered sucessfully");
			else
				response.sendRedirect("./add_event.jsp?msg=registered failed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
