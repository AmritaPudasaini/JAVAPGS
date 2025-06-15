abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
    void generatePaySlip() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
}
class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String name, int id, double rate, int hours) {
        super(name, id);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
public class PayrollSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        Employee emp2 = new ContractEmployee("Bob", 102, 25, 160);

        emp1.generatePaySlip();
        System.out.println();
        emp2.generatePaySlip();
    }
}
