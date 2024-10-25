public class Objects_Cars {

    public static void main(String[] args) {
        
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println(myCar1.price);

        myCar1.drive();
        myCar1.brake();
    }
}

class Car {

    String make = "Porche";
    String model = "Cayane";
    int year = 2020;
    String color = "blue";
    double price = 150000.00;

    void drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the brakes");
    }    
}
