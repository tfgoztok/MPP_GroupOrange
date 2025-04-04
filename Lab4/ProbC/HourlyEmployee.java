package Lab4.ProbC;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;

    public HourlyEmployee(int empId, double hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }
}
