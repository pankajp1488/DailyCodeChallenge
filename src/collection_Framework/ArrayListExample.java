package collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListExample {
    public static void main (String [] args){

        // Create an ArrayList of Integer type
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements into the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Print complete list
        System.out.println("Original List : " + numbers);

        //get number at index 2
        System.out.println("Number at index 2 is " + numbers.get(2));

        // Update value at index 1 it will replace existing value at index 1
        numbers.set(1,15);
        numbers.add(17);
        numbers.add(18);
        numbers.add(21);
        numbers.add(26);


        System.out.println("Updated List is : " + numbers);

        // Remove element using index
        numbers.remove(2);
        System.out.println("Updated List after removel is : " + numbers);

        //check list contains mentioned number
        System.out.println("List contains 15? " +numbers.contains(15));
        System.out.println("List contains 40? " +numbers.contains(40));

        // Print all elements using for loop
        for(int i=0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        //numbers.clear(); -> function is used to clear all the list

        //check list is empty or not
        System.out.println(numbers.isEmpty());

    }
}
