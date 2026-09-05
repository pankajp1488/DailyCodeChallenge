package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static void main (String[] args){

        List<String> words = Arrays.asList(
                "listen", "silent", "enlist",
                "rat", "tar", "art",
                "hello"
        );

        Map<String , List<String>> result = words.stream()
                .collect(Collectors.groupingBy(word -> {
                    // Convert String -> char[]
                    char[] chars = word.toCharArray();

                    Arrays.sort(chars);

                    return new String(chars);
                }));
        // STEP 5: Print the anagram groups
        System.out.println(result.values());
    }
}
