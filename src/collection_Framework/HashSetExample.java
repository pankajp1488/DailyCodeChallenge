package collection_Framework;

import java.util.HashSet;

public class HashSetExample {
    public static void main (String [] args){

        //create hashset
        HashSet<String> Students = new HashSet<>();

        Students.add("Pankaj");
        Students.add("Sahil");
        Students.add("Sujit");
        Students.add("Rushi");
        Students.add("Komal");
        Students.add(null);

        //Allows only one null
        Students.add(null);

        System.out.println(Students);

        //add duplicate elements
        Students.add("Rushi");
        Students.add("Komal");

        System.out.println(Students);

        Students.remove("Sujit");
        System.out.println(Students);

        System.out.println(Students.contains("Komal"));
        System.out.println(Students.size());

        //System.out.println(Students.get(0));
        //cannot access by index in hashset

    }
}
