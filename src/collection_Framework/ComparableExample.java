package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(103, "Rahul", 50000));

        employees.add(new Employee(101, "Amit", 70000));

        employees.add(new Employee(104, "Neha", 45000));

        employees.add(new Employee(102, "Priya", 60000));

        // Collections.sort() internally calls compareTo()

        Collections.sort(employees);

        System.out.println(employees);

    }

}
