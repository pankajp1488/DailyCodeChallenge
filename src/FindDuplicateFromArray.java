import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 1, 3, 4, 9, 6};

        Set<Integer> result = findDuplicates(arr);
        System.out.println(result);
    }

    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}