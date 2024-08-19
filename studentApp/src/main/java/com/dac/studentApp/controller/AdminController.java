package com.dac.studentApp.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.dac.studentApp.model.Student;
import com.dac.studentApp.service.StudentService;


@Controller
public class AdminController {
	
	@Autowired
	public StudentService studentService;
	
	
	@GetMapping("/updateStudents")
    public String getAll(Model model) {
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        return "adminOptions/updateStudents";  // Ensure this corresponds to the Thymeleaf template name
    }

    // Method to get a single student by rollNo for editing
    @GetMapping("/updateStudents/getOne/{rollNo}")
    @ResponseBody
    public Optional<Student> getOne(@PathVariable int rollNo) {
        return studentService.getOne(rollNo);
    }

    // Method to add a new student
    @PostMapping("/updateStudents/addNew")
    public String addNew(Student student) {
        studentService.addNew(student);
        return "redirect:/updateStudents";
    }

    // Method to update student details
    @RequestMapping(value = "/updateStudents/update", method = {RequestMethod.PUT, RequestMethod.POST})
    public String update(Student student) {
        studentService.update(student);
        return "redirect:/updateStudents";
    }

    // Method to delete a student by rollNo
    @RequestMapping(value = "/updateStudents/delete/{rollNo}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(@PathVariable int rollNo) {
        studentService.delete(rollNo);
        return "redirect:/updateStudents";
    }


}
