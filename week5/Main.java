public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000);

        System.out.println(emp1.getName() + "'s Salary: " + emp1.getSalary());

        // HR updates salary
        HR hr = new HR();
        hr.updateEmployeeSalary(emp1, 60000);

        System.out.println(emp1.getName() + "'s Salary after HR update: " + emp1.getSalary());
    }
}