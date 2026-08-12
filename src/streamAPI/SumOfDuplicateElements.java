package streamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfDuplicateElements {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,5,4};

        // STEP 1: Convert int[] -> Integer Stream
        int sum = Arrays.stream(arr)
                .boxed()

                // STEP 2: Group same numbers and count their occurrence
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))

                // STEP 3: Convert Map -> Entry Stream
                .entrySet().stream()

                // STEP 4: Keep only duplicate numbers (count > 1)
                .filter(x -> x.getValue() > 1)

                // STEP 5: Get only the numbers (keys)
                .map(x -> x.getKey())

                // STEP 6: Convert Integer -> int and calculate sum
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}