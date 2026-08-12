package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//from array seprate out even and odd numbers
public class EvenOddNumberList {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    System.out.println(list);

    List<List<Integer>> checkedlist = list.stream()
            .collect(Collectors.partitioningBy(x -> x%2 ==0, Collectors.toList()))
            .entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());

        System.out.println(checkedlist);

    }


}
