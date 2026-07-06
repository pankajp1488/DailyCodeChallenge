package collection_Framework;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main (String [] args){
        //Create new linkdedlsit and assign soe employees
        LinkedList <String> employees = new LinkedList<>();

        //add some employees to linkedlist
        employees.add("Suraj");
        employees.add("Amit");
        employees.add("Neha");
        employees.add("Ankita");

        System.out.println(employees);

        // Add element at the beginning
        employees.addFirst("Komal");
        System.out.println(employees);

        employees.addLast("Sahil");
        System.out.println(employees);

        // Get last element
        System.out.println(employees.getLast());

        // Update element at index 2
        employees.set(2,"Robin");
        System.out.println("Updated linkedList is " +employees);

        // Remove first element
        employees.removeFirst();
        employees.removeLast();
        System.out.println(employees);

        System.out.println(employees.size());

        //add at specific index will not affect already existing element it will just shift
        //employees.set(1,"mangesh"); will replace original element
        employees.add(1 , "Amit");
        System.out.println(employees);

        for(int i=0; i< employees.size(); i++ ){
            System.out.println(employees);
        }


    }

}
