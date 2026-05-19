public class DebugStringExample {

    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are NOT equal");
        }
    }
}