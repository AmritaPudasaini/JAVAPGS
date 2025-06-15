abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
    abstract void displayDetails();
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
    void displayDetails() {
        System.out.println("Full-Time Employee");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + calculateSalary());
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    void displayDetails() {
        System.out.println("Part-Time Employee");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + calculateSalary());
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Alice", 101, 4000);
        PartTimeEmployee pte = new PartTimeEmployee("Bob", 102, 20, 80);
        fte.displayDetails();
        System.out.println();
        pte.displayDetails();
    }
}
