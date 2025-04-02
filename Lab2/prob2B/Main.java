package prob2B;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD001");
        
        OrderLine line1 = new OrderLine(order, 1);
        OrderLine line2 = new OrderLine(order, 2);
        OrderLine line3 = new OrderLine(order, 3);
        
        System.out.println(order);
        System.out.println("Order Lines:");
        for (OrderLine line : order.getOrderLines()) {
            System.out.println(line);
        }
        
        System.out.println("\nVerifying relationships:");
        System.out.println("Line 1's order: " + line1.getOrder());
        System.out.println("Order contains line 1: " + order.getOrderLines().contains(line1));
    }
} 