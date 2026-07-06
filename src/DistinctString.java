import java.util.Arrays;
import java.util.List;

public class DistinctString {
    public static void main (String [] args){

        //declare list
        List<String > names = Arrays.asList("Zeon","Pranil","Amit","Vipul","baby","Amit","Vipul");

            //Collecttions into streams
              names.stream()
                      //remove duplicates
                   .distinct()
                      //sort default in ascending order
                      .sorted()
                      //apply for each element in the list
                   .forEach(System.out::println);
    }
}
