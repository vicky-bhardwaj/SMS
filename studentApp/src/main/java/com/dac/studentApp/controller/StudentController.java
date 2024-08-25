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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dac.studentApp.exceptionhandler.SessionExpiredException;
import com.dac.studentApp.model.Attendance;
import com.dac.studentApp.model.Feedback;
import com.dac.studentApp.model.Student;
import com.dac.studentApp.model.StudentAttendance;
import com.dac.studentApp.model.Teacher;
import com.dac.studentApp.service.AttendanceService;
import com.dac.studentApp.service.FeedbackService;
import com.dac.studentApp.service.StudentService;
import com.dac.studentApp.service.TeacherService;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private AttendanceService attendanceService;
	@Autowired
	private FeedbackService feedbackService;
	
		
	    @PostMapping("/sd")
	    public String sDashboard(@ModelAttribute("studentdata") Student student, Model model) {
	    	boolean check=studentService.validateLogin(student);
	    	if(check==true) {
	    		Student stu=studentService.getByPRN(student);
	    		model.addAttribute("student",stu);
	    		return "studentDashboard";
		        } else {
		        	 model.addAttribute("errorMessage", "Invalid PRN or Password. Please try again.");
		        	 return "studentLogin";
		        }
	    }
	    @GetMapping("/sd")
	    public String getDashboard(@ModelAttribute("student") Student student, Model model,HttpSession session) {
	        
	    	if (session.getAttribute("student") == null) {
	            throw new SessionExpiredException(); // Throw the custom exception if the session is expired
	        }
	        model.addAttribute("student", student); 
	        return "studentDashboard"; 
	    }
	
	
	@GetMapping("student/attendance")
	public String attendanceTracker(@ModelAttribute("student") Student student, Model model) {
		StudentAttendance studentAttendance=attendanceService.getOne(student.getRollNo());
		List<Attendance> attendanceList=attendanceService.getDates(student.getRollNo());
		model.addAttribute(attendanceList);
		model.addAttribute(studentAttendance);
		model.addAttribute(student);
		return "studentOptions/attendanceTracker";
	}
	
	
	@GetMapping("student/profile")
	public String viewStudent(@ModelAttribute("student") Student student, Model model) {
		model.addAttribute(student);
		return "studentOptions/viewStudent";
	}
	
	
	@GetMapping("student/notes")
	public String notesStudent(@ModelAttribute("student") Student student, Model model) {
		model.addAttribute(student);
		return "studentOptions/notesStudent";
	}
	
	
	@GetMapping("student/assignments")
	public String assignmentStudent(@ModelAttribute("student") Student student, Model model) {
		model.addAttribute(student);
		return "studentOptions/assignmentStudent";
	}
	
	
	@GetMapping("student/feedback")
	public String feedback(@ModelAttribute("student") Student student, Model model) {
		List<Teacher> teachers = teacherService.getAll();
        model.addAttribute("teachers", teachers);
		model.addAttribute(student);
		return "studentOptions/feedback";
	}
	

	@PostMapping("student/submitFeedback")
	public String submitFeedback(@ModelAttribute("student")Student student, @RequestParam("teacherId") String teacherId,
	                             @RequestParam("rating") int rating,
	                             @RequestParam("comments") String comments, RedirectAttributes redirectAttributes)
	                              {
	    // Create and save the feedback
	    Feedback feedback = new Feedback();
	    feedback.setTeacherId(teacherId);
	    feedback.setPRN(student.getPRN());
	    feedback.setRating(rating);
	    feedback.setComments(comments);

	    feedbackService.saveFeedback(feedback);

	    redirectAttributes.addFlashAttribute("message", "Feedback has been successfully recorded.");


        
        return "redirect:/sd";
	}


}
