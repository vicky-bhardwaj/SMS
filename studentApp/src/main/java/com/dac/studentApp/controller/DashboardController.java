package com.dac.studentApp.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dac.studentApp.model.Admin;
import com.dac.studentApp.model.Student;
import com.dac.studentApp.model.Teacher;

@Controller
public class DashboardController {
	
	    @PostMapping("/sd")
	    public String sDashboard(@ModelAttribute("studentdata") Student student) {
	    	 if(student.getPRN()==123456 && student.getPassword().equals("s123")) {
		            return "studentDashboard";
		        } else {
	    	return "studentLogin";
		        }
	    }
	    @PostMapping("/td")
	    public String tDashboard( @ModelAttribute("teacherdata") Teacher teacher) {
	    	 if(teacher.getTeacherId().equals("t101") && teacher.getPassword().equals("t123")) {
		            return "teacherDashboard";
		        } else {
	    	return "teacherLogin";
		        }
	    }
	    @PostMapping("/ad")
	    public String aDashboard( @ModelAttribute("admindata") Admin admin) {
	        if(admin.getAdminId().equals("admin") && admin.getPassword().equals("admin123")) {
	            return "adminDashboard";
	        } else {
	            return "adminLogin";
	        }
	    }


}
