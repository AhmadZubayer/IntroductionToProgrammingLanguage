class Vehicle {
    String carName;
    double speed;
    static final double SPEEDLIMIT = 70.0; // Use a class-level constant for speed limit

    public Vehicle() {}

    public Vehicle(String carName, double speed) {
        this.carName = carName;
        this.speed = speed;
    }

    public Vehicle(Vehicle vehicle) {
    	carName = vehicle.carName;
    	speed = vehicle.speed;
    }

    public boolean checkSpeedLimit(Vehicle vehicle) {
        return this.speed <= SPEEDLIMIT; // Check if the vehicle's speed is within the limit
    }

    public void display(Vehicle vehicle) {
    	System.out.println(vehicle.carName + " has speed " + vehicle.speed); // Uses the passed vehicle's carName
    	if (vehicle.checkSpeedLimit(vehicle)) {
            System.out.println(vehicle.carName + " is within the speed limit.");
        } else {
            System.out.println(vehicle.carName + " is speeding too fast! SLOW DOWN!");
        }
    }
    
    /*
     * MEANINGFUL WAY:------------------------------------------------------------------ 
     *  public boolean checkSpeedLimit() {
            return this.speed <= SPEEDLIMIT;
        }
        
        public void display() {
        System.out.println(this.carName + " has speed " + this.speed);
        if (this.checkSpeedLimit()) {
           System.out.println(this.carName + " is within the speed limit.");
        } else {
           System.out.println(this.carName + " is speeding too fast! SLOW DOWN!");
        }
      }
      ----------------------------------------------------------------------------------
     */
}

public class ObjectPassing {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("BMW", 70);
        Vehicle vehicle2 = new Vehicle("Porsche", 100);
        Vehicle vehicle3 = new Vehicle(vehicle1); // Creating a copy of vehicle1

        vehicle1.display(vehicle1);
        vehicle2.display(vehicle2);
        vehicle3.display(vehicle3); 
    }
}

