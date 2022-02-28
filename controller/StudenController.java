package com.SpringbootProject.StudentManagement.controller;

import com.SpringbootProject.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudenController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String listOfStudents(Model model){
        model.addAttribute("student",studentService.getAllstudents());
        return "students";

    }



}
