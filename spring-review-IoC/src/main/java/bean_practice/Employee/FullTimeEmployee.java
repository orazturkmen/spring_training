package bean_practice.Employee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, String employeeId) {
        super(name, employeeId);
    }

    @Override
    public void work() {
        System.out.println(getName() +" "+ " is working full time");
    }
}
