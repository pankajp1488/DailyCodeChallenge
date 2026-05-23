public class PassByValueExample {

    public static void changeValue(int number) {

        // Changing local copy
        number = 100;

        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {

        int num = 50;

        System.out.println("Before method call: " + num);

        // Pass copy of variable
        changeValue(num);

        // Original value remains unchanged
        System.out.println("After method call: " + num);
    }
}