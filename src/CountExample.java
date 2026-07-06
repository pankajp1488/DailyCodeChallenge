import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main (String []args){
        List<Integer> numbers = Arrays.asList(10,21,30,40,50,60,70);

        long count = numbers.stream()
                .filter(n -> n%2 ==0)
                   .count();

        System.out.println("Total even number count of list is " + count);
    }
}
