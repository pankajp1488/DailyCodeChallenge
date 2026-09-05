package streamAPI;

import java.util.Arrays;

public class ProductOfFirstTwoElements {

    public static void main (String [] args){

        int [] arr = {5,8,9,3,8,9,7};

        int product = Arrays.stream(arr)
                .limit(2) //keeps only 2 elements from the stream.
                .reduce(1, (a, b) -> a * b);  //product of two elements convert to 1

        System.out.println(product);


    }
}
