package Lab10.Prob2.PartC;

import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return name.equals(e.name) && salary == e.salary;
    }

    @Override
    public String toString() {
        return name + " : " + salary;
    }
}

class EmployeeInfo {
    enum SortMethod { BYNAME, BYSALARY }

    public void sort(List<Employee> emps, SortMethod method) {
        Collections.sort(emps, (e1, e2) -> {
            if (method == SortMethod.BYNAME) {
                int nameComp = e1.name.compareTo(e2.name);
                if (nameComp != 0) return nameComp;
                return Double.compare(e1.salary, e2.salary);
            } else {
                return Double.compare(e1.salary, e2.salary);
            }
        });
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Joe", 150000),
                new Employee("Joe", 100000),
                new Employee("Anna", 120000)
        );

        new EmployeeInfo().sort(employees, SortMethod.BYNAME);
        employees.forEach(System.out::println);
    }
}

