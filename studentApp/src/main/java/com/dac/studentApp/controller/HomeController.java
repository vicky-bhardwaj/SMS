package com.dac.studentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@GetMapping(value = "/index")
    public String index() {
        return "indexPage";
    }
	@GetMapping(value = "/logout")
    public String logout() {
        return "indexPage";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

  
}
