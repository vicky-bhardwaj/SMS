package com.dac.studentApp.model;


import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;


@Component
public class Admin {
	
	@NotNull(message="{error.adminId.blank}")
	private String adminId;
	@NotNull(message="{error.password.blank}")
	private String password;
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
