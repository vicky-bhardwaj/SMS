package com.dac.studentApp.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.dac.studentApp.exceptionhandler.SessionExpiredException;
import com.dac.studentApp.model.Admin;
import com.dac.studentApp.model.Student;
import com.dac.studentApp.model.StudentAttendance;
import com.dac.studentApp.model.Teacher;
import com.dac.studentApp.service.AttendanceService;
import com.dac.studentApp.service.StudentService;
import com.dac.studentApp.service.TeacherService;

import jakarta.servlet.http.HttpSession;


@Controller
@SessionAttributes("admin")
public class AdminController {
	@Autowired
	private StudentAttendance studentAttendance;
	@Autowired
	private AttendanceService attendanceService;
	
    @PostMapping("/ad")
    public String aDashboard( @ModelAttribute("admindata") Admin admin, Model model) {
        if(admin.getAdminId().equals("admin") && admin.getPassword().equals("admin123")) {
        	Admin admin1=admin;
        	admin1.setAdminName("Admin");
        	model.addAttribute("admin",admin1);
            return "adminDashboard";
        } else {
        	model.addAttribute("errorMessage", "BAD CREDENTIALS!");
            return "adminLogin";
        }
    }
    @GetMapping("/ad")
    public String getDashboard( @ModelAttribute("admin") Admin admin, Model model) {
//    	if (session.getAttribute("student") == null) {
//            throw new SessionExpiredException(); // Throw the custom exception if the session is expired
//        }
    	model.addAttribute("admin",admin);
        return "adminDashboard";
    }
	
	@Autowired
	public StudentService studentService;
	
	//method to get all students
		@GetMapping("/updateStudents")
	    public String getAllStudents(@ModelAttribute("admin") Admin admin,Model model) {
	        List<Student> students = studentService.getAll();
	        model.addAttribute("admin",admin);
	        model.addAttribute("students", students);
	        return "adminOptions/updateStudents";  
	    }

	 // Method to add a new student
	    @PostMapping("/updateStudents/addNew")
	    public String addNew(Student student) {
	    	student.setPassword(student.getlName());
	        studentService.addNew(student);
	        
	        studentAttendance.setRollNo(student.getRollNo());
	        attendanceService.addNew(studentAttendance);
	        
	        return "redirect:/updateStudents";
	    }
	
    //	Method to redirect to editPage student details
    	@GetMapping("/updateStudents/edit")
    	public String editStudent( @RequestParam(value="rollNo") int rollNo, Model model) {
    	
    	Student student=studentService.getOne(rollNo);
    	if(student==null) {
    		return "redirect:/updateStudents";
    	}
    	else
    		System.out.println(student.getRollNo());
    		model.addAttribute("student",student);
    	
    		return "adminOptions/editStudent";
    	
    	} 
    // Method to update
    	@PostMapping("/updateStudents/edit")
    	public String update(Student student) {
    		student.setPassword(student.getlName());
    		studentService.update(student);
    		return "redirect:/updateStudents";
    	
    	} 
    //  Method to delete a student by rollNo
        @GetMapping("/updateStudents/delete") 
        public String delete(@RequestParam(value = "rollNo") int rollNo) {
            studentService.delete(rollNo);
            studentAttendance.setRollNo(rollNo);
	        attendanceService.delete(studentAttendance);
            return "redirect:/updateStudents";
        }

    
    
    
//    for updating teachers--------------->
        
	    @Autowired
	    private TeacherService teacherService;
	
	    // Method to get all teachers
	    @GetMapping("/updateTeachers")
	    public String getAllTeachers(@ModelAttribute("admin") Admin admin,Model model) {
	        List<Teacher> teachers = teacherService.getAll();
	        model.addAttribute("admin",admin);
	        model.addAttribute("teachers", teachers);
	        return "adminOptions/updateTeachers";  
	    }
	
	 
	
	    // Method to add a new teacher
	    @PostMapping("/updateTeachers/addNew")
	    public String addNew(Teacher teacher) {
	    	teacher.setPassword(teacher.getlName());
	        teacherService.addNew(teacher);
	        return "redirect:/updateTeachers";
	    }
	    //	Method to redirect to editPage teacher details
		@GetMapping("/updateTeachers/edit")
		public String editTeacher( @RequestParam(value="teacherId") String teacherId, Model model) {
		
		Teacher teacher=teacherService.getOne(teacherId);
		if(teacher==null) {
			return "redirect:/updateTeachers";
		}
		else
			System.out.println(teacher.getTeacherId());
			model.addAttribute("teacher",teacher);
		
			return "adminOptions/editTeacher";
		
		} 
	// Method to update
		@PostMapping("/updateTeachers/edit")
		public String update(Teacher teacher) {
			teacher.setPassword(teacher.getlName());
			teacherService.update(teacher);
			return "redirect:/updateTeachers";
		
		} 
	
	    @GetMapping("/updateTeachers/delete") 
	    public String delete(@RequestParam(value = "teacherId") String teacher) {
	        teacherService.delete(teacher);
	        return "redirect:/updateTeachers";
	    }

}
