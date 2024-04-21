package com.cydeo.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

//    @NotNull
//    @NotEmpty
    @NotEmpty
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;

    //Thymeleaf accepts yyyy-mm-dd
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
