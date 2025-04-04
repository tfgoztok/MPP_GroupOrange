package Lab4.ProbC;

public class Order {
    private int orderID;
    private double amount;
    private int month;
    private int year;

    public Order(int orderid, double amount, int month, int year) {
        this.orderID = orderid;
        this.amount = amount;
        this.month = month;
        this.year = year;
    }

    public int getOrderID() {
        return orderID;
    }

    public double getAmount() {
        return amount;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
