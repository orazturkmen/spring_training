package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PersonController {
    @RequestMapping("/person")
    public String getData(Model model){

        List<Person> personList = new ArrayList<>();
        personList.addAll(
                Arrays.asList(
                        new Person("Mike", "Smith",35, Gender.MALE),
                        new Person("Jack", "Sparrow",32, Gender.MALE),
                        new Person("Miley", "Cruse",39, Gender.FEMALE),
                        new Person("Selena", "Gomez",29, Gender.FEMALE)
                )
        );

        model.addAttribute("persons", personList);

        return "/person/personDataTable";
    }
}
