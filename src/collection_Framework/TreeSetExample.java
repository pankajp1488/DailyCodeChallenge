package collection_Framework;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main (String [] args){
        // Create TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(80);
        numbers.add(45);
        numbers.add(90);
        numbers.add(60);
        numbers.add(70);

        System.out.println(numbers);
       // System.out.println("\nFirst:");
        System.out.println("1st element is " +numbers.first());
        System.out.println("1st element is " +numbers.last());

        //print number higher than 60
        System.out.println(numbers.higher(60));

        //print number lower than 60
        System.out.println(numbers.lower(60));

        //floor -> Largest element less than or equal to the given value.
        System.out.println(numbers.floor(65));

        //treeSet cannot store null values  , maintains sorted order ,

    }
}
