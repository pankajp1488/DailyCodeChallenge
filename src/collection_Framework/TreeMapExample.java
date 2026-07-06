package collection_Framework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main (String [] args){
        TreeMap<Integer , String> empDetails = new TreeMap<>();

        empDetails.put(105, "Rahul");
        empDetails.put(101, "Amit");
        empDetails.put(110, "Neha");
        //empDetails.put(null, "Siya");
        empDetails.put(103, "Priya");
        //updated value
        empDetails.put(103, "Rohan");

        System.out.println(empDetails);

        System.out.println(empDetails.get(103));

        System.out.println("\nhigher than 103:");
        System.out.println(empDetails.higherKey(103));

        // Lower Key
        System.out.println("\nLower than 103:");
        System.out.println(empDetails.lowerKey(103));

        // Ceiling Key
        System.out.println("\nCeiling of 104:");
        System.out.println(empDetails.ceilingKey(104));

        // Floor Key
        System.out.println("\nFloor of 104:");
        System.out.println(empDetails.floorKey(104));


        //itration
        for(Map.Entry<Integer , String> entry: empDetails.entrySet()){
            System.out.println(entry.getKey() +"->"+ entry.getValue());
        }

    }
}
