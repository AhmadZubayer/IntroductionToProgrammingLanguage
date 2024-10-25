
public class StaticVar_Employee {
	// Static variable: same for all instances of StaticVar_Employee
    static String DEPARTMENT = "Accounting";

    // Instance variable: different for every instance of StaticVar_Employee
    String name;

    // Constructor
    public StaticVar_Employee(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Create instances of StaticVar_Employee
        StaticVar_Employee employee1 = new StaticVar_Employee("Ahmad");
        StaticVar_Employee employee2 = new StaticVar_Employee("Zubayer");

        // Reference static variable using class name
        System.out.println(StaticVar_Employee.DEPARTMENT); // prints "Accounting"

        // Print instance variables
        System.out.println(employee1.name); // prints "Ahmad"
        System.out.println(employee2.name); // prints "Zubayer"
        
        // Change static variable using class name
        StaticVar_Employee.DEPARTMENT = "Marketing";

        // Print static variable again to see the change
        System.out.println(StaticVar_Employee.DEPARTMENT); // prints "Marketing"

        // Even after changing the static variable, it is the same for all instances
        // accessed the static variable using an instance
        System.out.println(employee1.DEPARTMENT); // prints "Marketing"
        System.out.println(employee2.DEPARTMENT); // prints "Marketing"
    }
}
