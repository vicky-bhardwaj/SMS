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

import com.dac.studentApp.model.Teacher;
import com.dac.studentApp.service.TeacherService;

@Controller
@RequestMapping("/updateTeachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    // Method to get all teachers
    @GetMapping
    public String getAll(Model model) {
        List<Teacher> teachers = teacherService.getAll();
        model.addAttribute("teachers", teachers);
        return "adminOptions/updateTeachers";  // Ensure this corresponds to the Thymeleaf template name
    }

    // Method to get a single teacher by teacherId for editing
    @GetMapping("/getOne/{teacherId}")
    @ResponseBody
    public Optional<Teacher> getOne(@PathVariable String teacherId) {
        return teacherService.getOne(teacherId);
    }

    // Method to add a new teacher
    @PostMapping("/addNew")
    public String addNew(Teacher teacher) {
        teacherService.addNew(teacher);
        return "redirect:/adminOptions/updateTeachers";
    }

    // Method to update teacher details
    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.POST})
    public String update(Teacher teacher) {
        teacherService.update(teacher);
        return "redirect:/adminOptions/updateTeachers";
    }

    // Method to delete a teacher by teacherId
    @RequestMapping(value = "/delete/{teacherId}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(@PathVariable String teacherId) {
        teacherService.delete(teacherId);
        return "redirect:/adminOptions/updateTeachers";
    }
}

