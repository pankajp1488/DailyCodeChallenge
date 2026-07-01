import java.util.Arrays;
import java.util.List;

public class UpperCaseExample {
    //upperscae example using map lambda stream apis

    public static void main (String [] args){

        //define list
        List<String> names = Arrays.asList("robin" , "rahul" , "rohit");

        names.stream()
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);

    }
}
