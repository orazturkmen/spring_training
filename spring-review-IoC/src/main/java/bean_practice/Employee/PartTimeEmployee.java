package bean_practice.Employee;

import org.springframework.stereotype.Component;

@Component
public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, String employeeId) {
        super(name, employeeId);
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + " is working part time");
    }
}
