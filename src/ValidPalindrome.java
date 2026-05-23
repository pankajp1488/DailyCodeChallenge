public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println("Cleaned String: " + s);

        StringBuilder sb = new StringBuilder(s);

        String reversed = sb.reverse().toString();

        System.out.println("Reversed String: " + reversed);

        return s.equals(reversed);
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        System.out.println(result);
    }
}