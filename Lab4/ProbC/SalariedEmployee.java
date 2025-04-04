package Lab4.ProbC;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(int empId, double monthlySalary) {
        super(empId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return monthlySalary;
    }
}