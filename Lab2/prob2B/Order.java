package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNum;
    private List<OrderLine> orderLines;

    public Order(String orderNum) {
        this.orderNum = orderNum;
        this.orderLines = new ArrayList<>();
    }

    public void addOrderLine(OrderLine line) {
        orderLines.add(line);
    }

    public String getOrderNum() {
        return orderNum;
    }

    public List<OrderLine> getOrderLines() {
        return new ArrayList<>(orderLines);
    }

    @Override
    public String toString() {
        return "Order [orderNum=" + orderNum + ", number of lines=" + orderLines.size() + "]";
    }
} 