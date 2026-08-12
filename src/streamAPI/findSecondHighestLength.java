package streamAPI;


import java.util.Arrays;
import java.util.Comparator;

//Give sentence -> Find word that has second highest length
public class findSecondHighestLength {
    public static void main(String [] args){
        String s = "I am good javaee Developer";

        String word =         Arrays.stream(s.split(" "))
                                    .sorted(Comparator.comparing(String::length)
                                    .reversed()).skip(1).findFirst().get();


        int lengthOfword = Arrays.stream(s.split(" "))
                                 .map(x -> x.length())
                                 .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(word);
        System.out.println(lengthOfword);

    }
}
