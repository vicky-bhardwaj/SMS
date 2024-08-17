package com.dac.studentApp.model;

import java.sql.Blob;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Student {

	@Id
	@Column(name="rollNo")
	private int rollNo;
	private String fName;
	private String lName;
	private String DOB;
	private char gender;
	private String email;
	private long mobile;
	
	@ManyToOne  
	@JoinColumn(name = "courseId") // Foreign key column in the Student table
	private Course course;
	private long PRN;
	private String password;
	@Lob
	private Blob image;
	
	public Student() {
		
	}
	
	

	public Student(int rollNo, String fName, String lName, String dOB, char gender, String email, long mobile,
			Course course, long pRN, String password, Blob image) {
		super();
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
		DOB = dOB;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.course = course;
		PRN = pRN;
		this.password = password;
		this.image = image;
	}



	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public long getPRN() {
		return PRN;
	}

	public void setPRN(long pRN) {
		PRN = pRN;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}
	
	
	
}
