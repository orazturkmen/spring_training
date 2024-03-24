package bean_practice;

import bean_practice.Employee.Employee;
import bean_practice.Employee.FullTimeEmployee;
import bean_practice.Employee.PartTimeEmployee;
import bean_practice.config.EmployeeConfig;
import bean_practice.config.NewConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);

        fullTimeEmployee.work();
        partTimeEmployee.work();

        System.out.println("************************************************************");

        ApplicationContext str = new AnnotationConfigApplicationContext(NewConfig.class);
        String str1 = str.getBean("str1",String.class);
        String str2 = str.getBean("str2",String.class);

        System.out.println(str1);
        System.out.println(str2);
    }
}
