package Lab4.ProbC;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> list = new ArrayList();
        list.add(new Order(1, 100,5,2024));
        list.add(new Order(2, 100, 6, 2024));
        CommissionedEmployee cm = new CommissionedEmployee(123,0.8,500,list);
        Employee[] emp = { new SalariedEmployee(121,4000), new HourlyEmployee(122,15.67,20),cm};
        for(Employee e :emp){
            Paycheck paycheck = e.calcCompensation(5, 2024);
            System.out.println(e.getEmpId() + "'s paycheck: " + paycheck);
        }
    }
}