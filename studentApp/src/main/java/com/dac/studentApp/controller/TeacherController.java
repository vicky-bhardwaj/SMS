package com.dac.studentApp.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dac.studentApp.exceptionhandler.SessionExpiredException;
import com.dac.studentApp.model.Feedback;
import com.dac.studentApp.model.Student;
import com.dac.studentApp.model.Teacher;
import com.dac.studentApp.service.AttendanceService;
import com.dac.studentApp.service.FeedbackService;
import com.dac.studentApp.service.StudentService;
import com.dac.studentApp.service.TeacherService;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("teacher")
public class TeacherController {

	
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private FeedbackService feedbackService;
	
	    @PostMapping("/td")
	    public String tDashboard( @ModelAttribute("teacherdata") Teacher teacher, Model model) {
	    	
	    	boolean check=teacherService.validateLogin(teacher);
	    	if(check==true) {
	    		Teacher teach=teacherService.getOne(teacher.getTeacherId());
	    		model.addAttribute("teacher",teach);
	    		return "teacherDashboard";
		        } else {
		        	 model.addAttribute("errorMessage", "Invalid Teacher ID or Password. Please try again.");
		        	 return "teacherLogin";
		        }
	    }
	    
	    @GetMapping("/td")
	    public String getDashboard(@ModelAttribute("teacher") Teacher teacher, Model model,HttpSession session )
	    {
	    	if (session.getAttribute("teacher") == null) {
	            throw new SessionExpiredException(); // Throw the custom exception if the session is expired
	        }
	    	model.addAttribute("teacher",teacher);
	    	return "teacherDashboard";
	    }
	
			@GetMapping("teacher/attendance")
			public String attendance(@ModelAttribute("teacher") Teacher teacher, Model model ) {
				 List<Student> students = studentService.getAll();
			    model.addAttribute("students", students);
				model.addAttribute("teacher",teacher);
				return "teacherOptions/attendance";
			}
			@GetMapping("teacher/profile")
			public String viewTeacher(@ModelAttribute("teacher") Teacher teacher, Model model ) {
				model.addAttribute("teacher",teacher);
				return "teacherOptions/viewTeacher";
			}
			@GetMapping("teacher/notes")
			public String notesTeacher(@ModelAttribute("teacher") Teacher teacher, Model model ) {
				model.addAttribute("teacher",teacher);
				return "teacherOptions/notesTeacher";
			}
			@GetMapping("teacher/assignments")
			public String assignmentTeacher(@ModelAttribute("teacher") Teacher teacher, Model model ) {
				model.addAttribute("teacher",teacher);
				return "teacherOptions/assignmentTeacher";
			}
			@GetMapping("teacher/feedback")
			public String feedbackTracker(@ModelAttribute("teacher") Teacher teacher, Model model ) {
				List<Feedback>feedbackList=feedbackService.getTeacher(teacher.getTeacherId());
				double avgRating=feedbackService.getAvgRating(teacher.getTeacherId());
				model.addAttribute("feedbackList", feedbackList);
				model.addAttribute("averageRating",avgRating);
				model.addAttribute("teacher",teacher);
				return "teacherOptions/feedbackTracker";
			}
			
			
			 @Autowired
			    private AttendanceService attendanceService;

			    @PostMapping("/teacher/submitAttendance")
			    public String submitAttendance(@RequestParam("attendanceDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate attendanceDate,
			            @RequestParam Map<String, String> requestParams, Model model) {
			    	System.out.println("1st");
//			        String dateString = requestParams.get("attendanceDate");
//			        LocalDate date = LocalDate.parse(dateString);
			        LocalDate date =attendanceDate;
			        System.out.println("2nd");

			        Map<Integer, Boolean> attendanceMap = new HashMap<>();
			        for (Map.Entry<String, String> entry : requestParams.entrySet()) {
			        		System.out.println("3rd");
			            if (entry.getKey().startsWith("attendance[")) {
			                int rollNo = Integer.parseInt(entry.getKey().substring(11, entry.getKey().length() - 1));
			                boolean present = entry.getValue().equals("present");
			                attendanceMap.put(rollNo, present);
			            }
			        }
			        System.out.println("4th");
			        attendanceService.saveAttendance(attendanceMap, date);

			        // Add success message to the model
			        model.addAttribute("message", "Attendance has been successfully recorded.");

			        // Redirect to a confirmation or dashboard page
			        return "redirect:/td";
			    }

}
