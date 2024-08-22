package com.dac.studentApp.model;




import org.springframework.stereotype.Component;


@Component
public class Admin {
	

	private String adminId;
	
	private String password;
	
	private String adminName;
	
	
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
