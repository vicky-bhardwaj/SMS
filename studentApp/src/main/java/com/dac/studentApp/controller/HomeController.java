package com.dac.studentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {

	@GetMapping(value = "/")
    public String index() {
        return "indexPage";
    }
	@GetMapping(value = "/logout")
    public String logout(HttpSession session) {
		 session.invalidate();
        return "indexPage";
    }

    @GetMapping("/error")
    public String about() {
        return "errorPage";
    }

  
}
