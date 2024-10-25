/*
Implement a Java program that manages information about vehicles and cars using object-oriented principles. Follow these steps:

Create a base class Vehicle with the following properties:

A private attribute vid (Vehicle ID).
A private attribute Register_id (Registration ID).
A default constructor that prints "DEFAULT VEHICLE CONSTRUCTOR".
A parameterized constructor that takes vid and Register_id as parameters and initializes them.
A method display() that prints the vehicle information (vid and Register_id).
Create a derived class Car that extends the Vehicle class:

A private attribute cid (Car ID).
A default constructor that sets cid to "0-0" and prints "DEFAULT CAR CONSTRUCTOR- CID: 0-0".
A parameterized constructor that takes cid and Register_id as parameters and initializes them using super to call the parent class's constructor.
Override the display() method to:
Print "CAR INFORMATION".
Use super.display() to print the general vehicle information.
Print the car-specific information (cid).
In the main method:

Create an instance of the Vehicle class using the parameterized constructor and display its information.
Create an instance of the Car class using the parameterized constructor and display its information.
*/

class Vehicle {
    private String vid;
    private String Register_id;

    // Default Constructor
    public Vehicle() {
        System.out.println("DEFAULT VEHICLE CONSTRUCTOR");
    }

    // Parameterized Constructor
    public Vehicle(String vid, String Register_id) {
        this.vid = vid;
        this.Register_id = Register_id;
    }

    // Display method
    public void display() {
        System.out.println("VEHICLE INFORMATION: ");
        System.out.println("VID: " + vid);
        System.out.println("VEHICLE RID: " + Register_id);
        System.out.println();
    }
}

class Car extends Vehicle {
    private String cid;

    // Default Constructor
    public Car() {
        super(); // Call to Vehicle's default constructor
        this.cid = "0-0";
        System.out.println("DEFAULT CAR CONSTRUCTOR- CID: " + cid);
    }

    // Parameterized Constructor
    public Car(String cid, String Register_id) {
        super(Register_id, Register_id); // Call to Vehicle's parameterized constructor
        this.cid = cid;
    }

    // Display method
    @Override
    public void display() {
        System.out.println("CAR INFORMATION: ");
        // Access private variables of Vehicle using a method
        // Direct access is not possible, so use display() method in Vehicle class
        super.display(); // Calls Vehicle's display method
        System.out.println("CID: " + cid);
        System.out.println();
    }
}

public class VehicleCar {
    public static void main(String[] args) {
        // Create and display Vehicle and Car objects
        Vehicle v1 = new Vehicle("6969-A-DHAKA", "1212-A-DHAKA");
        Car c1 = new Car("1296-DHAKA", "1206-DHAKA");

        v1.display();
        c1.display();
    }
}
