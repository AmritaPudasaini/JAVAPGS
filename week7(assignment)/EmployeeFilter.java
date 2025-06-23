import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anil", 48000));
        employees.add(new Employee("Sunita", 60000));
        employees.add(new Employee("Ravi", 52000));
        employees.add(new Employee("Meena", 45000));
        employees.add(new Employee("Suresh", 75000));

        System.out.println("Employees earning more than ₹50,000:");
        employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
