package com.dac.studentApp.model;

import java.sql.Blob;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Component
@Entity
public class Subject {

	@ManyToOne
	@JoinColumn(name="courseId")
	private Course course;
	@Id
	@Column(name="subCode")
	private int subCode;
	private String subName;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "subject")
	private List<Notes> notes;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "subject")
	private List<Assignments> assignments;
	
	public Subject() {
		
	}
	
	public Subject(Course course, int subCode, String subName, List<Notes> notes, List<Assignments> assignments) {
		super();
		this.course = course;
		this.subCode = subCode;
		this.subName = subName;
		this.notes = notes;
		this.assignments = assignments;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getSubCode() {
		return subCode;
	}
	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public List<Notes> getNotes() {
		return notes;
	}
	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}
	public List<Assignments> getAssignments() {
		return assignments;
	}
	public void setAssignments(List<Assignments> assignments) {
		this.assignments = assignments;
	}

	
	
	
	
	
}
