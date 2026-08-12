package streamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstElementWithSingleOccurance {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3, 6};

        // STEP 1: Convert int[] -> Integer Stream
        // boxed() converts primitive int into Integer
        int result = Arrays.stream(arr)
                .boxed()

                // STEP 2: Group same elements and count their occurrence
                // x -> x = Group by the element itself
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                ))

                // STEP 3: Convert Map -> Entry Stream
                .entrySet().stream()

                // STEP 4: Keep only elements occurring exactly once
                // count == 1 means element is non-repeated
                .filter(x -> x.getValue() == 1)

                // STEP 5: Get the element itself from Map Entry
                .map(x -> x.getKey())

                // STEP 6: Take the first non-repeated element
                .findFirst()

                // STEP 7: Get Integer value from Optional
                .get();

        // STEP 8: Print the first non-repeated element
        System.out.println(result);
    }
}