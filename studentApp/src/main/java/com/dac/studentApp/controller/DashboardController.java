package com.dac.studentApp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dac.studentApp.model.Admin;

@Controller
public class DashboardController {
	
	    @GetMapping("/sd")
	    public String sDashboard() {
	        return "studentDashboard";
	    }
	    @GetMapping("/td")
	    public String tDashboard() {
	        return "teacherDashboard";
	    }
	    @PostMapping("/ad")
	    public String aDashboard(@Valid@ModelAttribute("admindata") Admin admin , 
	 			BindingResult result) {
	    	//check for admin data
	    	if(result.hasErrors()) {
	    		return "adminLogin";
	    	}
	    	else if(admin.getAdminId().equals("admin") && admin.getPassword().equals("admin123")) 
	    	{
	    		return "adminDashboard";
	    	}
	    	else {
	    		return "adminLogin";
	    	}
	    }

}
