package streamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        //Given a string find 1st non-repeated character
        String s = "swiss";

       String ans = Arrays.stream(s.split(""))
               .collect(Collectors.groupingBy(x->x,Collectors.counting()))
               .entrySet().stream()
               .filter(x->x.getValue()==1)
               .map(x->x.getKey())
               .findFirst()
               .get();

        System.out.println(ans);
    }
}