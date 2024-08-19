package com.dac.studentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dac.studentApp.model.Admin;
import com.dac.studentApp.model.Student;
import com.dac.studentApp.model.Teacher;

@Controller
public class LoginController {

    @GetMapping("/studentLogin")
    public String studentLogin(Model model) {
    	model.addAttribute("studentdata", new Student());
        return "studentLogin";
    }
    @GetMapping("/teacherLogin")
    public String teacherLogin(Model model) {
    	model.addAttribute("teacherdata", new Teacher());
        return "teacherLogin";
    }
    @GetMapping("/adminLogin")
    public String showAdminLoginForm(Model model) {
        model.addAttribute("admindata", new Admin());
        return "adminLogin";
    }



}
