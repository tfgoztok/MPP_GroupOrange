package prob2B;

public class OrderLine {
    private Order order;
    private int lineNum;

    public OrderLine(Order order, int lineNum) {
        this.order = order;
        this.lineNum = lineNum;
        order.addOrderLine(this);
    }

    public Order getOrder() {
        return order;
    }

    public int getLineNum() {
        return lineNum;
    }

    @Override
    public String toString() {
        return "OrderLine [order=" + order.getOrderNum() + ", lineNum=" + lineNum + "]";
    }
} 