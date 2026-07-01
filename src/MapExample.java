import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static void main (String []args){

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        numbers.stream()

                // Multiply every number by 2
                // n represents each element from the stream
                // The returned value (n * 2) becomes the new element
                .map(n -> n * 2)
                // Print each transformed value
                .forEach(System.out::println);
    }
}
