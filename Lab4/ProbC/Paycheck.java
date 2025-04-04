package Lab4.ProbC;

final class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double stateTax;
    private final double localTax;
    private final double medicare;
    private final double socialSecurity;
    private final double netPay;

    public Paycheck(double grossPay, double fica, double stateTax, double localTax, double medicare, double socialSecurity, double netPay) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.stateTax = stateTax;
        this.localTax = localTax;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.netPay = netPay;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getNetPay() {
        return netPay;
    }

    @Override
    public String toString() {
        return String.format("Paycheck [Gross Pay: %.2f, Net Pay: %.2f, FICA: %.2f, State Tax: %.2f, Local Tax: %.2f, Medicare: %.2f, Social Security: %.2f]",
                grossPay, netPay, fica, stateTax, localTax, medicare, socialSecurity);
    }
}
