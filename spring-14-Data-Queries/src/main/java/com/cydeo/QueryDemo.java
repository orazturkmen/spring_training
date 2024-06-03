package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    public final RegionRepository regionRepository;
    public final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("------------Regions------------");
        System.out.println("findByCountry" + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountryContaining" + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingDesc" + regionRepository.findByCountryContainsOrderByRegionDesc("United"));
        System.out.println("findByCountryContaining" + regionRepository.findByCountryContainsOrderByRegion("United"));
        System.out.println("findTopByCountry" + regionRepository.findTopByCountry("United States"));
        System.out.println("findTop2ByCountry" + regionRepository.findTop2ByCountry("United States"));
        System.out.println("findTopByCountryContainsOrderByRegion" + regionRepository.findTopByCountryContainsOrderByRegion("United States"));


        System.out.println("------------Departments------------");

        System.out.println("findByDepartment" + departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivision" + departmentRepository.findByDivision("Health"));
        System.out.println("findByDivisionEndsWith" + departmentRepository.findByDivisionEndsWith("ics"));
        System.out.println("findDistinctTop3ByDivisionContains" + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

        System.out.println("------------Employees------------");
        System.out.println("findByEmail" + employeeRepository.findByEmail("myakovlivf@ucsd.edu"));
        System.out.println("findByFirstNameAndLastName" + employeeRepository.findByFirstNameAndLastName("Aldon","Paddison"));
        System.out.println("findByFirstNameIs" + employeeRepository.findByFirstNameIs("Ali"));
        System.out.println("findByLastNameStartsWith" + employeeRepository.findByLastNameStartsWith("Dov"));
        System.out.println("findBySalaryGreaterThan" + employeeRepository.findBySalaryGreaterThan(1980000));
        System.out.println("findBySalaryLessThan" + employeeRepository.findBySalaryLessThan(22000));
        System.out.println("findBySalaryBetween" + employeeRepository.findBySalaryBetween(58000,60000));
        //System.out.println("" + employeeRepository.findTopBySalaryGreaterThan(1));
        System.out.println("findByEmailEquals" + employeeRepository.findByEmailEquals(null));
    }
}
