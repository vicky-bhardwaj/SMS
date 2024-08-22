package com.dac.studentApp.model;

import java.sql.Blob;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;


@Component
@Entity
public class Teacher {

	@Id
	private String teacherId;
	private String fName;
	private String lName;
	private String email;
	private String password;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "subCode")
	private List<Subject> subject;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "courseId")
	private List<Course> course;
	
	
	public Teacher() {
		
	}

	
	
	public Teacher(String teacherId, String fName, String lName, String email, String password,
			List<Subject> subject, List<Course> course) {
		super();
		this.teacherId = teacherId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		
		this.password = password;
		
		this.subject = subject;
		this.course = course;
	}



	public String getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}





	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Subject> getSubject() {
		return subject;
	}


	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}




	public List<Course> getCourse() {
		return course;
	}


	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
	
	
}
