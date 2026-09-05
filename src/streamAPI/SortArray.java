package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortArray {
    //Given an int[] array, arrange the numbers in Descending/Ascending Order
    public static void main (String [] args) {
        int[] arr = {5, 1, 3, 6, 9, 2, 4};


        int[] ascending = Arrays.stream(arr)

                // STEP 2: Sort numbers in Ascending Order
                // Small -> Large
                .sorted()

                // STEP 3: Convert Stream -> int[]
                .toArray();


        int[] descending = Arrays.stream(arr)
                .boxed()      //convert int to integer ->comparator works with integer
                .sorted(Comparator.reverseOrder())//decending to ascending
                .mapToInt(Integer::intValue) //Convert Integer Stream -> int[]
                .toArray();

        //Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::println);

        System.out.println("Ascending  : " + Arrays.toString(ascending));
        System.out.println("Descending  : " + Arrays.toString(descending));
    }
}
