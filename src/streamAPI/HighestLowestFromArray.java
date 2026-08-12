package streamAPI;

import java.util.Arrays;

public class HighestLowestFromArray {
    public static void main (String [] args){

        int [] arr = {1,2,3,4,5,6,7,8,9};
        // STEP 1: Convert int[] -> IntStream
        // STEP 2: Find minimum/maxium element
        // STEP 3: Get value from OptionalInt
        int Highest = Arrays.stream(arr).max().getAsInt();

        int lowest = Arrays.stream(arr).min().getAsInt();

        System.out.println(Highest);
        System.out.println(lowest);
    }
}
