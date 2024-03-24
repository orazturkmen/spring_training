package bean_practice.Employee;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Employee {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract void work();
}
