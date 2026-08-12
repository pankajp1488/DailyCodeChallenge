package streamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurancesOfWord {
    public static void main (String [] args){
        String s = "I am Java Programmer so learning basics of Java";

        Map<String , Long> ans = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(x -> x ,Collectors.counting()));

        System.out.println(ans);
    }
}
