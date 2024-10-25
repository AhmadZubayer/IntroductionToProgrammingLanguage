/* Problem:

Appliance
String brand
double dailyPowerConsumption
int warranty
Appliance()
Appliance(String brand, double
power, int warranty)
void setBrand(String brand)
String getBrand()
void setPower(double power)
double getPower()
void setWarranty(int warranty)
int getWarranty()
void showApplianceInfo()

Refrigerator
double capacity
boolean hasFreezer
Refrigerator()
Refrigerator(String brand, double power, int warranty, double
capacity, boolean hasFreezer)
void setCapacity(double capacity)
double getCapacity()
void setHasFreezer(boolean hasFreezer)
boolean getHasFreezer()
double monPowerConsumption()//calculates and returns the monthly total
power consumed by a Refrigerator.
void calculateBill()//monthly bill is calculated and displayed where per
unit power consumption cost is 8tk.
void showRefrigeratorInfo()

***Complete the Appliance and Refrigerator class and after that write a Main Class and create two Sample objects of the
Refrigerator class and demonstrate the use of all methods.***

OUTPUT:
REFRIGERATOR 1 INFORMATION:
Brand: Samsung
Daily Power Consumption: 1.2 kwh
Warranty: 2 years
Capacity: 350.0 liters
Has Freezer: Yes
Monthly Power Consumption: 36.0 kwh
Monthly Bill: 288.0 tk

REFRIGERATOR 2 INFORMATION:
Brand: Sharp
Daily Power Consumption: 1.4 kwh
Warranty: 5 years
Capacity: 360.0 liters
Has Freezer: Yes
Monthly Power Consumption: 42.0 kwh
Monthly Bill: 336.0 tk
*/


class Appliance {
    String brand;
    double dailyPowerConsumption;
    int warranty;

    // Default constructor
    public Appliance() {
        this.brand = "no brand provided";
        this.dailyPowerConsumption = 0.0;
        this.warranty = 0;
    }

    // Parameterized Constructor
    public Appliance(String brand, double power, int warranty) {
        this.brand = brand;
        this.dailyPowerConsumption = power;
        this.warranty = warranty;
    }

    // Set & Get Method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // Set & Get Method for daily power consumption
    public void setPower(double power) {
        this.dailyPowerConsumption = power;
    }

    public double getPower() {
        return dailyPowerConsumption;
    }

    // // Set & Get Method for warranty
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    // Method to display appliance information
    public void showApplianceInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Daily Power Consumption: " + dailyPowerConsumption + " kwh");
        System.out.println("Warranty: " + warranty + " years");
    }
}

class Refrigerator extends Appliance {
    double capacity;
    boolean hasFreezer;

    // Deafult Constructor
    public Refrigerator() {
        super();  // Calls the default constructor of the Applaince class
        this.capacity = 0.0;
        this.hasFreezer = false;
    }

    // Parameterized Constructor
    public Refrigerator(String brand, double power, int warranty, double capacity, boolean hasFreezer ) {
        super(brand, power, warranty);
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    // Set & Get methods for capacity
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    // Set & Get methods for hasFreezer
    public void setHasFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;
    }

    public boolean getHasFreezer() {
        return hasFreezer;
    }

    public double monthlyPowerConsummption() {
        return getPower() * 30;
    }

    public void calculateBill() {
        double bill = monthlyPowerConsummption() * 8; // 8 taka per unit
        System.out.println("Monthly Power Consumption: " + monthlyPowerConsummption() + " kwh");
        System.out.println("Monthly Bill: " + bill + " tk");
    }

    public void showRefrigeratorInfo() {
        showApplianceInfo();
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Has Freezer: " + (hasFreezer? "Yes" : "No"));
    }
}

public class ApplianceRefrigerator{
    public static void main(String[] args) {

        // Create First Refrigerator Object
        // Uses a parameterized constructor to initialize all the attributes of the Refrigerator object (refrigerator1) in a single step.
        // More concise and straightforward, less flexible
        Refrigerator refrigerator1 = new Refrigerator("Samsung", 1.2, 2, 350, true);
        System.out.println("REFRIGERATOR 1 INFORMATION: ");
        refrigerator1.showRefrigeratorInfo();
        refrigerator1.calculateBill();
        System.out.println();

        // Creates Second Refrigerator Object
        // Uses the default constructor to create the Refrigerator object (refrigerator2) and then setter methods to initialize each attribute individually.
        // More verbose, more flexible
        Refrigerator refrigerator2 = new Refrigerator();
        refrigerator2.setBrand("Sharp");
        refrigerator2.setPower(1.4);
        refrigerator2.setWarranty(5);
        refrigerator2.setCapacity(360);
        refrigerator2.setHasFreezer(true);
        
        System.out.println("REFRIGERATOR 2 INFORMATION: ");
        refrigerator2.showRefrigeratorInfo();
        refrigerator2.calculateBill();
        System.out.println();

    }
}

/**
 * Use Parameterized Constructors when you have all the information needed to initialize an object at the time of creation. This leads to cleaner and more concise code.
 * Use Default Constructors with Setter Methods when the values for attributes are not available at the time of object creation, or you want the flexibility to modify them later.
 */
