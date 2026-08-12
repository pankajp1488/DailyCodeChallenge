package streamAPI;

import java.util.Arrays;
import java.util.Comparator;

public class highestLength {
    public static void main (String [] args){
        String s = "I am Learning Stream APIs in java";

        String ans = Arrays.stream(s.split(" "))
                           .max(Comparator.comparing(String::length))
                           .get();

        System.out.println(ans);
    }
}
