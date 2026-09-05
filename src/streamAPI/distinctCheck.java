package streamAPI;

import java.util.Arrays;

public class distinctCheck {
    public static void main (String [] args){

        int [] arr = {1,2,3,4,5,6};

        boolean result = Arrays.stream(arr)
                .distinct() //removes duplicates
                .count()== arr.length; //check arr length with with after removing duplicates and returns boolean result

        System.out.println(result);
    }
}
