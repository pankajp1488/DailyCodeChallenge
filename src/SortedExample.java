import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {

    public static void main (String [] args){

        List<Integer> numbers = Arrays.asList(45,12,23,71,43,90,15);

        numbers.stream()

                //by defaults sorts to ascending
                .sorted()
                //in decending order
                //.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
