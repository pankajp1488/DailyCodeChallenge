package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

// Employee class
// Implements Comparable so that Java knows how to compare Employee objects
class Employee implements Comparable<Employee> {

    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // compareTo() tells Java how to sort
    @Override
    public int compareTo(Employee other) {

        // Sort by employee ID in ascending order

        return this.id - other.id;

    }

    // Print Employee nicely
    @Override
    public String toString() {

        return id + " " + name + " " + salary;
    }
}
