class Seven {
    String name;
    String department;

    // 1. Referencing Instance Variables
    public Seven(String name, String department) {
        this.name = name; // 'this.name' refers to the instance variable
        this.department = department; // 'this.department' refers to the instance variable
    }

    // 2. Calling Other Constructors
    public Seven() {
        this("Unknown", "Unknown"); // Calls the parameterized constructor
    }

    // 3. Returning the Current Instance
    public Seven setName(String name) {
        this.name = name;
        return this; // Returns the current instance
    }

    public Seven setDepartment(String department) {
        this.department = department;
        return this; // Returns the current instance
    }

    // Method to demonstrate all other uses
    void work() {
        System.out.println(this.name + " works at " + this.department);
    }

    // 5. Accessing the Current Class's Methods
    void startWork() {
        this.work(); // Ensures that work() is called on the current instance
    }

    // 4. Passing the Current Instance as a Parameter
    void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
    }

    void printDetailsWrapper() {
        Helper.printSevenDetails(this); // Passes the current instance
    }
}

class Helper {
    static void printSevenDetails(Seven emp) {
        emp.printDetails();
    }
}

public class Keyword_this {
    public static void main(String[] args) {
        // Creating instances using different constructors
        Seven employee1 = new Seven();
        Seven employee2 = new Seven("Homelander", "Vought International");

        // Demonstrating method chaining (Returning the Current Instance)
        Seven employee3 = new Seven().setName("Black Noir").setDepartment("Vought International");

        // Accessing instance variables and methods
        System.out.println(employee1.name + " - " + employee1.department);
        System.out.println(employee2.name + " - " + employee2.department);

        // Calling methods
        employee2.startWork();

        // Using the wrapper method to print details
        employee3.printDetailsWrapper();
    }
}
