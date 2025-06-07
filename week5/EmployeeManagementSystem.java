import java.util.Scanner;
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(name, salary);

        System.out.println("\nEmployee Name: " + employee.getName());
        System.out.println("Current Salary: $" + employee.getSalary());

        System.out.print("\nHR - Enter new salary for the employee: ");
        double newSalary = Double.parseDouble(scanner.nextLine());
        HR.updateSalary(employee, newSalary);

        System.out.println("\nUpdated Salary for " + employee.getName() + ": $" + employee.getSalary());

        scanner.close();
    }
}

class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    // Only HR can set the salary
    protected void setSalary(double salary) {
        this.salary = salary;
    }
}
class HR {
    public static void updateSalary(Employee employee, double newSalary) {
        employee.setSalary(newSalary);
        System.out.println("HR updated the salary successfully.");
    }
}
