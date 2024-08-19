package com.dac.studentApp.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dac.studentApp.model.Student;
import com.dac.studentApp.model.Teacher;
import com.dac.studentApp.service.StudentService;
import com.dac.studentApp.service.TeacherService;


@Controller
public class AdminController {
	
	@Autowired
	public StudentService studentService;
	
	//method to get all students
		@GetMapping("/updateStudents")
	    public String getAllStudents(Model model) {
	        List<Student> students = studentService.getAll();
	        model.addAttribute("students", students);
	        return "adminOptions/updateStudents";  
	    }

	 // Method to add a new student
	    @PostMapping("/updateStudents/addNew")
	    public String addNew(Student student) {
	        studentService.addNew(student);
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
    		studentService.update(student);
    		return "redirect:/updateStudents";
    	
    	} 
    //  Method to delete a student by rollNo
        @GetMapping("/updateStudents/delete") 
        public String delete(@RequestParam(value = "rollNo") int rollNo) {
            studentService.delete(rollNo);
            return "redirect:/updateStudents";
        }

    
    
    
//    for updating teachers--------------->
        
	    @Autowired
	    private TeacherService teacherService;
	
	    // Method to get all teachers
	    @GetMapping("/updateTeachers")
	    public String getAllTeachers(Model model) {
	        List<Teacher> teachers = teacherService.getAll();
	        model.addAttribute("teachers", teachers);
	        return "adminOptions/updateTeachers";  
	    }
	
	 
	
	    // Method to add a new teacher
	    @PostMapping("/updateTeachers/addNew")
	    public String addNew(Teacher teacher) {
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
			teacherService.update(teacher);
			return "redirect:/updateTeachers";
		
		} 
	//  Method to delete a teacher by rollNo
	    @GetMapping("/updateTeachers/delete") 
	    public String delete(@RequestParam(value = "teacherId") String teacher) {
	        teacherService.delete(teacher);
	        return "redirect:/updateTeachers";
	    }

}
