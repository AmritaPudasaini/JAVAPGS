public class Employee {
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

    private void setSalary(double salary) {
        this.salary = salary;
    }

    void updateSalaryByHR(double newSalary, HR hr) {
        if (hr != null) {
            setSalary(newSalary);
        } else {
            System.out.println("Access Denied: Only HR can update salary.");
        }
    }
}