package streamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosToBeginning {

    //Write a stream program to move all zero’s to beginning of array
    public static void main (String [] args){
        int [] arr ={1,0,4,0,8,0,2,3,0};

        IntStream zeros = Arrays.stream(arr)
                .filter(x -> x==0);
                //zeros.forEach(System.out::println);


        IntStream nonzeros = Arrays.stream(arr)
                .filter(x -> x!=0);

        int [] finalresult = IntStream.concat(zeros , nonzeros).toArray();

        System.out.println(Arrays.toString(finalresult));
    }
}
