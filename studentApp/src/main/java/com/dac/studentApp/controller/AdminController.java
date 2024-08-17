package com.dac.studentApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dac.studentApp.model.Student;
import com.dac.studentApp.service.StudentService;


@Controller
public class AdminController {
	
	@Autowired
	public StudentService studentService;
	
		 @GetMapping("/updateStudents")
		    public String updateStudents(Model model) {
			 	List<Student>students=new ArrayList<>();
			 	
			 	students=studentService.getStudents();
			 	for(Student s:students)
			 	System.out.println(s.getfName()+" "+s.getlName()+" "+s.getEmail());
			 	model.addAttribute("students", students);
			 
		        return "adminOptions/updateStudents"; // This should resolve to /WEB-INF/views/updateStudents.jsp
		    }
		 @GetMapping("/addStudent")
		    public String addStudents() {
		        return "adminOptions/studentOptions/addStudent"; // This should resolve to /WEB-INF/views/updateStudents.jsp
		    }
		
	
    
   

    @GetMapping("/updateTeachers")
    public String updateTeachers() {
        return "adminOptions/updateTeachers";
    }

    @GetMapping("/manageCourses")
    public String manageCourses() {
        return "manageCourses";
    }

    @GetMapping("/viewReports")
    public String viewReports() {
        return "viewReports";
    }

    @GetMapping("/systemSettings")
    public String systemSettings() {
        return "systemSettings";
    }
}
