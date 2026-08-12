package streamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main (String [] args){

        String str = "swisscom";

        String Ans = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x->x , Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue() >1 )
                .map(x->x.getKey())
                .findFirst()
                .get();

        System.out.print(Ans);
    }
}
