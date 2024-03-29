package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());
        return "/student/register";
    }

    @RequestMapping("/welcome")
    public String welcome(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age, @RequestParam String state){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(state);
        return "student/welcome";
    }
}
