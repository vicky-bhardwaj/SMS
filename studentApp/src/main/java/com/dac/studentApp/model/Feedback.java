package com.dac.studentApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Component
@Entity
@IdClass(FeedbackId.class)
public class Feedback {

	@Id
	private long PRN;
	@Id
	private String teacherId;
	private int rating;
	
	@Column(length = 400) 
	private String comments;

	
	public Feedback() {
		
	}
	
	public Feedback(long PRN,String teacherId, int rating, String comments) {
		super();
		this.PRN=PRN;
		this.teacherId = teacherId;
		this.rating = rating;
		this.comments = comments;
	}

    
	public long getPRN() {
		return PRN;
	}

	public void setPRN(long pRN) {
		PRN = pRN;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
