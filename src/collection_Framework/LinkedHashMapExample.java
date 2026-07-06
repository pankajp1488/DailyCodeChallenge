package collection_Framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main (String []args){

        LinkedHashMap<Integer , String > empdetails = new LinkedHashMap<>();

        //maintains insertion order
        empdetails.put(101 , "Rahul");
        empdetails.put(101 , "Rohit");
        empdetails.put(102 , "Pranil");
        empdetails.put(103 , "Sita");
        empdetails.put(104 , "Ram");

        //allows multiple null values
        empdetails.put(105 , null);
        empdetails.put(106 , null);

        //allows only one null key
        empdetails.put(null , "Shardul");
        empdetails.put(null , "Arvind");

        System.out.println(empdetails);

        //get employee based on key
        System.out.println(empdetails.get(101));

        // Update employee name
        empdetails.put(102, "Rohan");
        System.out.println(empdetails);

        //check value is available or not
        System.out.println(empdetails.containsValue("Rohan"));

        //check key is available or not
        System.out.println(empdetails.containsKey(101));

        for (Map.Entry<Integer , String > entry : empdetails.entrySet()){
            if(entry.getKey()!=null && entry.getValue()!=null){
                System.out.println("ID " +entry.getKey());
                System.out.println("Name " +entry.getValue());
                System.out.println("-------------------------------------------");
            }

        }
    }
}
