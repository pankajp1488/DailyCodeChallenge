package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings {
    public static void main (String [] args){
        String [] arr = {"Java", "Spring", "Java", "Microservices", "Spring", "AWS"};
                  List<String > uniqueList = Arrays.stream(arr)
                        .distinct()
                          //.forEach(System.out::println);
                                  .collect(Collectors.toList());

                  System.out.println(uniqueList);
    }
}
