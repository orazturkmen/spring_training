package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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


    @Query("select e from Employee e where e.email  = 'slefeuvre6d@abc.net.au'")
    Employee retrieveEmployeeDetail();


    @Query("select e.salary from Employee e where e.email = 'slefeuvre6d@abc.net.au'")
    Integer retrieveEmployeeSalary();

    //Not equal
    @Query("select e from Employee e where e.salary <>?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    //Like /Contains / StartsWith / EndsWith

    @Query("select e from Employee e where e.firstName like ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //Less Than
    @Query("select e.firstName from Employee e where e.salary < ?1")
    List<String> retrieveEmployeeSalaryLessThan(int salary);


    //Greater Than
    @Query("select e.firstName from Employee e where e.salary > ?1")
    List<String> retrieveEmployeeSalaryGreaterThan(int salary);

    //Between
    @Query("select e from Employee e where e.salary between ?1 and ?2")
    List<Employee> retrieveEmployeeSalaryBetween(int salary1, int salary);

    //Before
    @Query("select e from Employee e where e.hireDate > ?1")
    List<Employee> retrieveEmployeeHireDateBefore(LocalDate date);

    //Null
    @Query("select  e from Employee e where e.email is not null")
    List<Employee> retrieveEmployeeEmailIsNotNull();

    //sorting in asc order
    @Query("select e from Employee e order by e.salary ")
    List<Employee> retrieveEmployeeSalaryOrderAsc();

    //sorting in desc order
    @Query("select e from Employee e order by e.salary desc ")
    List<Employee> retrieveEmployeeSalaryOrderDesc();

    //Native Query
    @Query(value = "select * from employees where salary = ?1",nativeQuery = true)
    List<Employee> retrieveEmployeeDetailBySalary(int salary);

    //Named Parameter
    @Query("select e from Employee e where e.salary = :salary")
    List<Employee> retrieveEmployeeSalary(@Param("salary") int salary);

}
