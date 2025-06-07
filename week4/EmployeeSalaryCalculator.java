public class EmployeeSalaryCalculator {
    static final int MONTHLY_HOURS = 230;
    static final double MONTHLY_SALARY = 50000;
    static final double HOURLY_RATE = 2000;
    public static double calculateSalary (int hoursWorked, double hourlyRate) {
        if (hoursWorked <= MONTHLY_HOURS) {
            return MONTHLY_SALARY;
        }
        else{
            return MONTHLY_SALARY + calculateBonus(hoursWorked);
        }
    }
    public static double calculateBonus(int hoursWorked) {
        int extraHours = hoursWorked - MONTHLY_HOURS;
        if (extraHours>0){
            return extraHours * HOURLY_RATE;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int hoursWorked = 240;
        double hourlyRate = 217.39;
        double salary = calculateSalary(hoursWorked, hourlyRate);
        double bonus = calculateBonus(hoursWorked);
        System.out.println("Total Salary: Rs " + salary);
        System.out.println("Bonus: Rs " + bonus);
    }
}