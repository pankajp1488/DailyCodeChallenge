package collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main (String [] args){
        HashMap<String , Integer> empDetails = new HashMap<>();

        empDetails.put("Rahul" , 15000);
        empDetails.put("Samit" , 20000);
        empDetails.put("Anuj" , 25000);
        empDetails.put("Virat" , 30000);

        //allows one null key only in map
        //Can HashMap store multiple null values
        empDetails.put(null , 70000);
        empDetails.put(null , 80000);

        System.out.println(empDetails);

        //get rahuls details
        System.out.println(empDetails.get("Rahul"));

        //check value exist
        System.out.println(empDetails.containsValue(16000));

        empDetails.remove("Anuj" , 25000);

        System.out.println(empDetails);

        // Print key and value using entrySet()
        for (Map.Entry<String, Integer> entry : empDetails.entrySet()) {

            System.out.println("Employee : " + entry.getKey());

            System.out.println("Salary   : " + entry.getValue());

            System.out.println("----------------------");
        }

    }
}
