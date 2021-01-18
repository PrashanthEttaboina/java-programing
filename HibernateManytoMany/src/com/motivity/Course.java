package com.motivity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@Column(name="cid")
	private int cid;
	
	@Column(name="cname")
	private String cname;
	
	@ManyToMany(targetEntity=Student.class,cascade= {CascadeType.ALL})
	@JoinTable(name = "coursestudent", 
	joinColumns = { @JoinColumn(name = "cid") }, 
	inverseJoinColumns = { @JoinColumn(name = "sid") })
	private Set<Student> student;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	
}
