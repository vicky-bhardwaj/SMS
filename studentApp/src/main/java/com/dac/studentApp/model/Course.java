package com.dac.studentApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Course {

	@Id
	@Column(name="courseId")
	private int courseId;
	public String name;
	
	public Course() {
		
	}
	
	public Course(int courseId, String Name) {
		super();
		this.courseId = courseId;
		this.name = Name;
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return name;
	}
	public void setCourseName(String Name) {
		this.name = Name;
	}
	
	
	
}
