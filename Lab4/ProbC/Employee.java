package Lab4.ProbC;

abstract class Employee {
    private int empId;

    public Employee(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public abstract double calcGrossPay(int month, int year);

    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);
        double fica = grossPay * 0.23;
        double stateTax = grossPay * 0.05;
        double localTax = grossPay * 0.01;
        double medicare = grossPay * 0.03;
        double socialSecurity = grossPay * 0.075;
        double netPay = grossPay - (fica + stateTax + localTax + medicare + socialSecurity);

        return new Paycheck(grossPay, fica, stateTax, localTax, medicare, socialSecurity, netPay);
    }
}
