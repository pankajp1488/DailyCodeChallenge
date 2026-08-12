package streamAPI;


import java.util.Arrays;

//Que . Remove duplicate from string and returnn in sam eorder
public class removeDuplicate {
    public static void main (String [] args){
        String s = "abcabdeaf";

            Arrays.stream(s.split(""))
                  .distinct() //removes duplicates
                  .forEach(System.out::print);
    }
}
