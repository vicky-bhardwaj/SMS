package com.dac.studentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

}
