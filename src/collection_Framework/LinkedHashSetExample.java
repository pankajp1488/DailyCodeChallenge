package collection_Framework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main (String [] args){
        LinkedHashSet<String> employees = new LinkedHashSet<>();

        employees.add("Amit");
        employees.add("Yash");
        employees.add("Nikhil");
        employees.add("Sahil");
        employees.add("Neha");
        employees.add(null);
        //only one null allowed
        employees.add(null);

        //add duplicate - it will not duplicte
        employees.add("Yash");
        employees.add("Nikhil");

        employees.remove("Neha");

        System.out.println(employees);
        //checks rahul is available
        System.out.println(employees.contains("Rahul"));

        //check size of linkedhashmap
        System.out.println(employees.size());
    }
}
