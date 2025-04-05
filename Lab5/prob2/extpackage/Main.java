package prob2.extpackage;

import java.time.LocalDate;

import prob2.CustOrderFactory;
import prob2.Customer;
import prob2.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println("Customer:" + cust.getName() + "\nOrder List: " + cust.getOrders());
	}
}

		
