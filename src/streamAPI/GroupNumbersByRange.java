package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersByRange {

    public static void main (String [] args){

        int [] arr = {5, 12, 18, 25, 26 ,27 ,28 , 32, 47, 55, 68, 72} ;


        Map<Integer , List<Integer>> result = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(x -> ((x - 1) / 10) * 10 + 1));

        System.out.println(result);
    }
}
