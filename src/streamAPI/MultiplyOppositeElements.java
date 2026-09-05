package streamAPI;

import java.util.stream.IntStream;

public class MultiplyOppositeElements {
    //Write a program to multiply 1st and last element, 2nd and 2nd last element
    public static void main (String [] args){

        int [] arr = {1,2,3,4,5,6,7,8};

        // We need only half indexes because each index is paired with its opposite element.
        IntStream.range(0 , arr.length/2)

                // STEP 2: Get the opposite element for each index
                // First element  -> Last element
                // Second element -> Second Last element
                // Formula: arr[i] * arr[arr.length - 1 - i]
                .map(i -> arr[i] * arr[arr.length-1-i])
                .forEach(System.out::println);
    }
}
