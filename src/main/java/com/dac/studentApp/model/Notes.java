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
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int nNo;
	private String nDesc;
	@ManyToOne
	@JoinColumn(name="subCode")
	private Subject subject;
	@Lob
	private Blob note;
	
	
	public Notes() {
		
	}
	
	public Notes(int nNo, String nDesc, Blob note) {
		super();
		this.nNo = nNo;
		this.nDesc = nDesc;
		this.note = note;
	}
	
	public int getnNo() {
		return nNo;
	}
	public void setnNo(int nNo) {
		this.nNo = nNo;
	}
	public String getnDesc() {
		return nDesc;
	}
	public void setnDesc(String nDesc) {
		this.nDesc = nDesc;
	}
	public Blob getNote() {
		return note;
	}
	public void setNote(Blob note) {
		this.note = note;
	}
	
	
	
}
