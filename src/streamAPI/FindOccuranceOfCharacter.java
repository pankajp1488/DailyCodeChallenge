package streamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccuranceOfCharacter {
    public static void main (String [] args ){
        String s = "Programming";

        // Convert String -> String[] -> Stream<String> = Arrays.stream
        Map<String,Long> result = Arrays.stream(s.split(""))

                // Before counting, same characters must be grouped.
                // Group by the character itself = x->x

                // STEP 4: After grouping, what next?
                // Count how many elements are present in each group. = Collectors.counting()
                .collect(Collectors.groupingBy(x->x , Collectors.counting()));

        System.out.println(result);
    }
}
