package com.dac.studentApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Component
@Entity
public class Attendance {

	@Id
	@ManyToOne
	@JoinColumn(name="rollNo")
	private Student student;
	@ManyToOne
	@JoinColumn(name="subCode")
	private Subject subject;
	private int totalSession;
	private int present;
	
	public Attendance() {
		
	}
	
	public Attendance(Student student, Subject subject, int totalSession, int present) {
		super();
		this.student = student;
		this.subject = subject;
		this.totalSession = totalSession;
		this.present = present;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getTotalSession() {
		return totalSession;
	}
	public void setTotalSession(int totalSession) {
		this.totalSession = totalSession;
	}
	public int getPresent() {
		return present;
	}
	public void setPresent(int present) {
		this.present = present;
	}
	
	
	
	
	
}
