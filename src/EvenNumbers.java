import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Locale.filter;

public class EvenNumbers {
    public static void main (String [] args){

        //declare list
        List <Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

          //convvert list to streams
          number.stream()
                  //each number is checked for even
                .filter(n -> n % 2 == 0)
                  //multiply even numbers by 2
                  .map(n -> n * 2)
                  //sorts in ascending order
                  .sorted()
                .forEach(System.out::println);
    }
}
