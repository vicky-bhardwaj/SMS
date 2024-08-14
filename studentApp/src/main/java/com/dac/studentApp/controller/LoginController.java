package com.dac.studentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @GetMapping("/teacherRegister")
    public String teacherRegister() {
        return "teacherRegister";
    }
    @GetMapping("/resetPassword")
    public String forgotPassword() {
        return "forgotPassword";
    }
}
