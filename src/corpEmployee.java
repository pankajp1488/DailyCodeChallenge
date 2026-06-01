public class corpEmployee {

    // Instance variable
    int id;

    // Instance variable
    String name;

    public static void main(String[] args) {

        // Create first object
        corpEmployee e1 = new corpEmployee();

        // Assign values
        e1.id = 101;
        e1.name = "Rahul";

        // Create second object
        corpEmployee e2 = new corpEmployee();

        // Assign different values
        e2.id = 102;
        e2.name = "Amit";

        // Print first object values
        System.out.println(e1.id + " " + e1.name);

        // Print second object values
        System.out.println(e2.id + " " + e2.name);
    }
}