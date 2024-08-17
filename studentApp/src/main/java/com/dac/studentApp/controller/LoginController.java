package com.dac.studentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/studentLogin")
    public String studentLogin() {
        return "studentLogin";
    }
    @GetMapping("/teacherLogin")
    public String teacherLogin() {
        return "teacherLogin";
    }


}
