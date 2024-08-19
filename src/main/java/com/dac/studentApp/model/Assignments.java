package com.dac.studentApp.model;

import java.sql.Blob;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Assignments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aNo;
	private String aDesc;
	@ManyToOne
	@JoinColumn(name="subCode")
	private Subject subject;
	@Lob
	private Blob assignment;
	
	public Assignments() {
		
	}
	
	public Assignments(int aNo, String aDesc, Blob assignment) {
		super();
		this.aNo = aNo;
		this.aDesc = aDesc;
		this.assignment = assignment;
	}
	
	public int getaNo() {
		return aNo;
	}
	public void setaNo(int aNo) {
		this.aNo = aNo;
	}
	public String getaDesc() {
		return aDesc;
	}
	public void setaDesc(String aDesc) {
		this.aDesc = aDesc;
	}
	public Blob getAssignment() {
		return assignment;
	}
	public void setAssignment(Blob assignment) {
		this.assignment = assignment;
	}
	
	
	
}
