package Lab4.ProbC;
import java.util.List;

public class CommissionedEmployee extends Employee {
    private double baseSalary;
    private double commissionRate;
    private List<Order> orders;

    public CommissionedEmployee(int empId, double baseSalary, double commissionRate, List<Order> orders) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalSales = orders.stream()
                .filter(order -> order.getMonth() == month && order.getYear() == year)
                .mapToDouble(Order::getAmount)
                .sum();
        return baseSalary + (totalSales * commissionRate);
    }
}