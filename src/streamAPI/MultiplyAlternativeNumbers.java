package streamAPI;

import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class MultiplyAlternativeNumbers {
    public static void main (String [] args){
        int [] arr = {1,2,3,4,5,6,7,8};

        int product = IntStream.range(0, arr.length)
                // These represent 1st, 3rd, 5th... elements.
                .filter(i -> i%2==0)

                // STEP 3: Get actual array value using the index
                .map(i -> arr[i])
                .reduce(1,(a ,b) -> a*b);

        System.out.println(product);

    }
}
