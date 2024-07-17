public class Person {
    private String name; // Added semicolons to end of each variable declaration
    private int age;
    private String address;
    private String currentInsurance;

    // Constructor with three parameters
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.currentInsurance = "Health Insurance"; // Initializing currentInsurance
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name); // Changed printIn to println
        System.out.println("Age: " + age);   // Changed printIn to println
        System.out.println("Address: " + address); // Changed printIn to println
    }

    // Method named myDetails that displays details and insurance
    public void myDetails() {
        displayDetails();
        printCurrentInsurance();
    }

    // Method to print the current insurance of the person
    public void printCurrentInsurance() {
        System.out.println("CurrentInsurance: " + currentInsurance); // Changed printIn to println
    }

    public static void main(String[] args) {
        // Creating an object
        Person arnold = new Person("Arnold Kahuri", 20, "469 Kimbo Ruiru");

        // Calling myDetails method using the created object
        arnold.myDetails();
    }
}
