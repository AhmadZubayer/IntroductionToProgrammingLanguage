import java.util.ArrayList;

public class StaticArrayListCar {

	public String carName;

    /**
     * Static list to keep track of all created StaticArrayListCar objects
     * This allows all StaticArrayListCar objects to contribute to and access the same list of StaticArrayListCar instances.
     * Without static, every time you create a new StaticArrayListCar object using new StaticArrayListCar(), 
     * a new instance of CAR_LIST would be created for that specific StaticArrayListCar object.
     */
    static ArrayList<StaticArrayListCar> CAR_LIST = new ArrayList<StaticArrayListCar>();

    // Constructor
    public StaticArrayListCar(String carName) {
        this.carName = carName; // Assign the provided carName to the instance variable
        StaticArrayListCar.CAR_LIST.add(this); // Add the newly created StaticArrayListCar object to the static list
    }

    // Override toString method to provide a meaningful string representation
    
    public String toString() {
        return "StaticArrayListCar: " + carName;
    }

    // Main method
    public static void main(String[] args) {
        // Create two StaticArrayListCar objects
        StaticArrayListCar car1 = new StaticArrayListCar("BMW");
        StaticArrayListCar car2 = new StaticArrayListCar("Lexus");

        // Iterate over the static list and print each StaticArrayListCar object
        for (StaticArrayListCar car : StaticArrayListCar.CAR_LIST) {
            System.out.println(car);
        }
    }
}
