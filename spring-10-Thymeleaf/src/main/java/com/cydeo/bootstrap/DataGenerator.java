package com.cydeo.bootstrap;

import com.cydeo.model.Person;
import com.cydeo.model.Student;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static List<Student> createStudent(){
        return Arrays.asList(
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(30,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(30,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(30,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(30,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(30,50),new Faker().address().state())
        );
    }

    public static List<Person> createPerson(){
        return Arrays.asList(
                new Person(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().country().name()),
                new Person(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().country().name()),
                new Person(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().country().name()),
                new Person(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().country().name())
        );
    }
}
