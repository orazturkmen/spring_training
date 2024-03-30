package com.cydeo;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Faker().country().name());
        System.out.println(new Faker().address().state());
        System.out.println(new Faker().address().firstName());
    }
}
