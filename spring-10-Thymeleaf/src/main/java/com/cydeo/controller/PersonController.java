package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class PersonController {

    @RequestMapping("/app")
    public String apply(Model model){
        model.addAttribute("persons", DataGenerator.createPerson());

        return "/student/person";
    }
}
