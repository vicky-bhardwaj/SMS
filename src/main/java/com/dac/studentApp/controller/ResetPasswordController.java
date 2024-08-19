package com.dac.studentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResetPasswordController {


    @GetMapping("/resetPassword")
    public String forgotPassword() {
        return "forgotPassword";
    }
}
