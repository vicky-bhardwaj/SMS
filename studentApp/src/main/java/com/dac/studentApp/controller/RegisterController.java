package com.dac.studentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

	
    @GetMapping("/teacherRegister")
    public String teacherRegister() {
        return "teacherRegister";
    }
    
}
