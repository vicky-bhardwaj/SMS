package com.dac.studentApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class StudentAttendance {
	
	@Id
	private int rollNo;
	private int totalSessions;
	private int present;
	private double percentage;
	
	
	public StudentAttendance() {
		
	}
	public StudentAttendance(int rollNo, int totalSessions, int present, double percentage) {
		super();
		this.rollNo = rollNo;
		this.totalSessions = totalSessions;
		this.present = present;
		this.percentage = percentage;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getTotalSessions() {
		return totalSessions;
	}
	public void setTotalSessions(int totalSessions) {
		this.totalSessions = totalSessions;
	}
	public int getPresent() {
		return present;
	}
	public void setPresent(int present) {
		this.present = present;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
