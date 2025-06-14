import java.util.Scanner;
class Employee {
    String name;
    double baseSalary;
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    double calculateSalary() {
        return baseSalary;
    }
}
class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    double calculateSalary() {
        return baseSalary + bonus;
    }
}
class Developer extends Employee {
    int numberOfProjects;
    Developer(String name, double baseSalary, int numberOfProjects) {
        super(name, baseSalary);
        this.numberOfProjects = numberOfProjects;
    }
    double calculateSalary() {
        return baseSalary + (numberOfProjects * 500);
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Manager Name:");
        String mName = sc.nextLine();
        System.out.println("Enter Manager Base Salary:");
        double mBase = sc.nextDouble();
        System.out.println("Enter Manager Bonus:");
        double mBonus = sc.nextDouble();
        Manager manager = new Manager(mName, mBase, mBonus);
        sc.nextLine(); 
        System.out.println("\nEnter Developer Name:");
        String dName = sc.nextLine();
        System.out.println("Enter Developer Base Salary:");
        double dBase = sc.nextDouble();
        System.out.println("Enter Number of Projects:");
        int projects = sc.nextInt();
        Developer developer = new Developer(dName, dBase, projects);
        System.out.println("\nManager Total Salary: $" + manager.calculateSalary());
        System.out.println("Developer Total Salary: $" + developer.calculateSalary());
    }
}
