package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "Spring-MVC");

        String subject = "Spring Boot";
        model.addAttribute("subject", subject);

        int studentId = new Random().nextInt();
        model.addAttribute("id", studentId);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,5,78,6,45,2,72,54,1));
        model.addAttribute("nums", numbers);

        LocalDate dt = LocalDate.of(1996,1,27);
        model.addAttribute("date",dt);

        Student student = new Student(123,"jack", "borrow");
        model.addAttribute("student", student);



        return "/student/welcome";
    }
}
