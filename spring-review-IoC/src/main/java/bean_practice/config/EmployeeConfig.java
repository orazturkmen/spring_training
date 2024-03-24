package bean_practice.config;

import bean_practice.Employee.FullTimeEmployee;
import bean_practice.Employee.PartTimeEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee("Oraz", "456");
    }

    @Bean
    public PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee("Huday", "123");
    }
}
