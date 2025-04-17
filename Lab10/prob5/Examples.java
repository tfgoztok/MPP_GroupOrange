package Lab10.prob5;
import java.util.function.*;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ", id=" + id + "]";
    }
}

class EmployeeNameComparator {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class Apple {
    private int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

public class Examples {
    // A. (Employee e) -> e.getName()
    Function<Employee, String> getNameFunc = (Employee e) -> e.getName();
    Function<Employee, String> getNameRef = Employee::getName;
    // Method reference type: Class::instanceMethod

    // B. (Employee e, String s) -> e.setName(s)
    BiConsumer<Employee, String> setNameFunc = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> setNameRef = Employee::setName;
    // Method reference type: Class::instanceMethod

    // C. (String s1, String s2) -> s1.compareTo(s2)
    BiFunction<String, String, Integer> compareFunc = (String s1, String s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> compareRef = String::compareTo;
    // Method reference type: Class::instanceMethod

    // D. (Integer x, Integer y) -> Math.pow(x,y)
    BiFunction<Integer, Integer, Double> powFunc = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> powRef = Math::pow;
    // Method reference type: Class::staticMethod

    // E. (Apple a) -> a.getWeight()
    Function<Apple, Integer> getWeightFunc = (Apple a) -> a.getWeight();
    Function<Apple, Integer> getWeightRef = Apple::getWeight;
    // Method reference type: Class::instanceMethod

    // F. (String x) -> Integer.parseInt(x)
    Function<String, Integer> parseIntFunc = (String x) -> Integer.parseInt(x);
    Function<String, Integer> parseIntRef = Integer::parseInt;
    // Method reference type: Class::staticMethod

    // G. EmployeeNameComparator comp = new EmployeeNameComparator();
    // (Employee e1, Employee e2) -> comp.compare(e1,e2)
    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee, Employee, Integer> compareEmpFunc = (Employee e1, Employee e2) -> comp.compare(e1, e2);
    BiFunction<Employee, Employee, Integer> compareEmpRef = comp::compare;
    // Method reference type: Object::instanceMethod

    void evaluator() {
        // Test A
        Employee emp1 = new Employee("John", 1);
        System.out.println("A. getName: " + getNameRef.apply(emp1));
        
        // Test B
        Employee emp2 = new Employee("Jane", 2);
        System.out.println("B. Before setName: " + emp2.getName());
        setNameRef.accept(emp2, "Janet");
        System.out.println("B. After setName: " + emp2.getName());
        
        // Test C
        System.out.println("C. String compare: " + compareRef.apply("apple", "banana"));
        
        // Test D
        System.out.println("D. Math.pow: " + powRef.apply(2, 3));
        
        // Test E
        Apple apple = new Apple(150);
        System.out.println("E. Apple weight: " + getWeightRef.apply(apple));
        
        // Test F
        System.out.println("F. parseInt: " + parseIntRef.apply("42"));
        
        // Test G
        Employee emp3 = new Employee("Adam", 3);
        Employee emp4 = new Employee("Zack", 4);
        System.out.println("G. Employee compare: " + compareEmpRef.apply(emp3, emp4));
    }

    public static void main(String[] args) {
        Examples examples = new Examples();
        examples.evaluator();
    }
} 