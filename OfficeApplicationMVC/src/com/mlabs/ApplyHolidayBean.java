package com.mlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplyHolidayBean {
	private int no_of_holidays;
	
	private String name,email,phone,department,holiday_begin_date,status,manager_name;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getHoliday_begin_date() {
		return holiday_begin_date;
	}

	public void setHoliday_begin_date(String holiday_begin_date) {
		this.holiday_begin_date = holiday_begin_date;
	}

	public int getNo_of_holidays() {
		return no_of_holidays;
	}

	public void setNo_of_holidays(int no_of_holidays) {
		this.no_of_holidays = no_of_holidays;
	}

	public boolean apply(String name, String email, String phone, String department, int no_of_holidays,String holiday_begin_date) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("insert into holiday(name,email,phone,department,no_of_holidays,holiday_begin_date) values(?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, phone);
		ps.setString(4, department);
		ps.setInt(5, no_of_holidays);
		ps.setString(6, holiday_begin_date);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
	public List<ApplyHolidayBean> status(String email) throws ClassNotFoundException, SQLException{
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("select * from holiday where email=?");
		ps.setString(1, email);
		ResultSet rs=ps.executeQuery();
		ArrayList<ApplyHolidayBean> holiday_details=new ArrayList<>();
		while(rs.next()) {
			ApplyHolidayBean ab=new ApplyHolidayBean();
			ab.setName(rs.getString(2));
			ab.setEmail(rs.getString(3));
			ab.setPhone(rs.getString(4));
			ab.setDepartment(rs.getString(5));
			ab.setNo_of_holidays(rs.getInt(6));
			ab.setHoliday_begin_date(rs.getString(7));
			ab.setStatus(rs.getString(8));
			ab.setManager_name(rs.getString(9));
			holiday_details.add(ab);
		}
		return holiday_details;
	}
}
