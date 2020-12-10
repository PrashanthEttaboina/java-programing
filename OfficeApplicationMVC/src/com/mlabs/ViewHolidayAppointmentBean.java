package com.mlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViewHolidayAppointmentBean {
private int no_of_holidays,hid;
	
	public int getHid() {
	return hid;
}

public void setHid(int hid) {
	this.hid = hid;
}

	private String name,email,phone,department,holiday_begin_date,status,manager_name;
	
	public int getNo_of_holidays() {
		return no_of_holidays;
	}

	public void setNo_of_holidays(int no_of_holidays) {
		this.no_of_holidays = no_of_holidays;
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

	public List<ViewHolidayAppointmentBean> holidayList(String department) throws SQLException, ClassNotFoundException{
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("select * from holiday where department=?");
		ps.setString(1, department);
		ResultSet rs=ps.executeQuery();
		ArrayList<ViewHolidayAppointmentBean> Alist=new ArrayList<>();
		while(rs.next())
		{
			ViewHolidayAppointmentBean vh=new ViewHolidayAppointmentBean();
			vh.setHid(rs.getInt(1));
			vh.setName(rs.getString(2));
			vh.setEmail(rs.getString(3));
			vh.setPhone(rs.getString(4));
			vh.setDepartment(rs.getString(5));
			vh.setNo_of_holidays(rs.getInt(6));
			vh.setHoliday_begin_date(rs.getString(7));
			vh.setStatus(rs.getString(8));
			vh.setManager_name(rs.getString(9));
			Alist.add(vh);
		}
		
		return Alist;		
	}
}
