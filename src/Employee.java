public class Employee {

    int id;
    String name;

    // Constructor
    Employee(int id, String name) {

        // this.id refers to instance variable
        this.id = id;

        // this.name refers to instance variable
        this.name = name;
    }

    void display() {

        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Rahul");

        emp.display();
    }
}