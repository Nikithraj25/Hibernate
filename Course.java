package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course
{
	@Id
	private int id;
	private int coursefee;
	private String tname;
	private String subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(int coursefee) {
		this.coursefee = coursefee;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
