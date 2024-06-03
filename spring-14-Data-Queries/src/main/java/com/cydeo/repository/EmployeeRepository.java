package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //Display all employees with email address ""
    List<Employee> findByEmail(String email);

    //Display all employees with firstname "" and last name ""
    List<Employee> findByFirstNameAndLastName(String firstname,String lastname);

    //Display all employees that first name is ""
    List<Employee> findByFirstNameIs(String firstname);

    //Display all employees that last name starts with ""
    List<Employee> findByLastNameStartsWith(String lastname);

    //Display all employees with salaries greater than ??
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ??
    List<Employee> findBySalaryLessThan(Integer salary);

    //Display all employees with salaries between salary1 and salary2
    List<Employee> findBySalaryBetween(Integer salary1, Integer salary2);

    //Display all Employees that has been hired between "" and ""
    List<Employee> findByHireDateBetween(LocalDate startDate,LocalDate endDate);

    //Display all Employees where salaries greater and equal to "" in order-salary
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //Display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display employees with max salary
    List<Employee> findTopBySalaryGreaterThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailEquals(String email);
    List<Employee> findByEmailNull();

}
