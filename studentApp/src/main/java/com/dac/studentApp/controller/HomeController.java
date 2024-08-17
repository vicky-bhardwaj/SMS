package com.dac.studentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index")
public class HomeController {

	@GetMapping(value = "")
    public String index() {
        return "indexPage";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

  
}
