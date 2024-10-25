class Employee {
    String name;
    String department;

    public Employee() { } // Default Constructor

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    /*
     * In the background, the "this" keyword gets replaced by the object
     * example: this.name ---> employee1.name
     * 
     */

    String worksAt() {
        return this.name + " works at " + this.department;
    }
}

public class Constructors_Employee {
    public static void main(String[] args) {
        
    	Employee employee1 = new Employee();
        Employee employee2 = new Employee("Homelander", "Vought International");
        Employee employee3 = new Employee("Butcher", "THE BOYS");

        System.out.println(employee1.worksAt());
        System.out.println(employee2.worksAt());
        System.out.println(employee3.worksAt());
    }
}

