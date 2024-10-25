/*
Scenario: Employee and Clerk Management System

Imagine you are developing a simple Employee and Clerk Management System for a company. In this system, you have two types of classes:

Employee Class: Represents the general information about any employee in the company.

It contains fields such as id, name, and salary.
It has a default constructor and a parameterized constructor to initialize the employee details.
There are setter and getter methods to modify and retrieve the employee details.
The showInfo() method displays the employee's information.
Clerk Class: Inherits from the Employee class and represents a specific type of employee, the clerk.

In addition to the Employee class fields, it has an additional field workHour which stores the weekly work hours of the clerk.
It has both default and parameterized constructors.
Additional methods setWorkHour(), getWorkHour(), avgWorkHour(), and avgSalary() are provided to manage clerk-specific details.
The showInfo() method is overridden to display complete details, including the average work hours per week and annual salary.
You need to create multiple clerks and manage their information using the provided code. Each clerk has their own ID, name, salary, and weekly work hours. You can either provide the information directly or input it from the console.
*/

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Default Constructor
    public Employee() {
        this.name = "Not Provided";
    }

    // Parameterized Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void showInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Clerk extends Employee {
    private int workHour;

    // Default Constructor
    public Clerk() {
        super(); // Call to Employee's default constructor
    }

    // Parameterized Constructor
    public Clerk(int id, String name, double salary, int workHour) {
        super(id, name, salary); // Call to Employee's parameterized constructor
        this.workHour = workHour;
    }

    // Getter and Setter methods for workHour
    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getWorkHour() {
        return workHour;
    }

    // Calculate average work hours per day
    public double avgWorkHourPerDay() {
        return (double) workHour / 5; // Assuming a 5-day work week
    }

    // Calculate annual salary
    public double annualSalary() {
        return getSalary() * 12; // Assuming salary is monthly
    }

    @Override
    public void showInfo() {
        super.showInfo(); // Call to Employee's showInfo method
        System.out.println("Work Hours per Week: " + workHour);
        System.out.println("Average Work Hours per Day: " + avgWorkHourPerDay());
        System.out.println("Annual Salary: " + annualSalary());
    }
}

public class EmployeeClerk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create and initialize Clerk objects
        Clerk clerk1 = new Clerk();
        Clerk clerk2 = new Clerk();
        Clerk clerk3 = new Clerk(123456, "Homelander", 25000000, 40);

        // Set details for clerk1 using user input
        System.out.println("Enter details for Clerk 1:");
        System.out.print("ID: ");
        clerk1.setId(scan.nextInt());
        scan.nextLine(); // Consume newline

        System.out.print("Name: ");
        clerk1.setName(scan.nextLine());

        System.out.print("Salary: ");
        clerk1.setSalary(scan.nextDouble());

        System.out.print("Work Hours per Week: ");
        clerk1.setWorkHour(scan.nextInt());

        // Set details for clerk2 directly
        clerk2.setId(23547343);
        clerk2.setName("Ahmad Zubayer");
        clerk2.setSalary(500000.50);
        clerk2.setWorkHour(50);

        // Show information for all clerks
        System.out.println();
        System.out.println("Clerk 1 Information:");
        clerk1.showInfo();

        System.out.println();
        System.out.println("Clerk 2 Information:");
        clerk2.showInfo();

        System.out.println();
        System.out.println("Clerk 3 Information:");
        clerk3.showInfo();

        scan.close();
    }
}
