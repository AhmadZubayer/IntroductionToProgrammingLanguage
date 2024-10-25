public class InstanceVsStaticVar {
    // Static variable
    static int STATICCOUNTER = 0;

    // Instance variable
    int instanceCounter = 0;

    // Constructor
    public InstanceVsStaticVar() {
        STATICCOUNTER++;
        instanceCounter++;
    }

    public static void main(String[] args) {
        // Create first object
        InstanceVsStaticVar obj1 = new InstanceVsStaticVar();
        System.out.println("After creating obj1:");
        System.out.println("STATICCOUNTER: " + InstanceVsStaticVar.STATICCOUNTER); // 1
        System.out.println("instanceCounter: " + obj1.instanceCounter);    // 1

        // Create second object
        InstanceVsStaticVar obj2 = new InstanceVsStaticVar();
        System.out.println("After creating obj2:");
        System.out.println("STATICCOUNTER: " + InstanceVsStaticVar.STATICCOUNTER); // 2
        System.out.println("instanceCounter: " + obj2.instanceCounter);    // 1

        // Create third object
        InstanceVsStaticVar obj3 = new InstanceVsStaticVar();
        System.out.println("After creating obj3:");
        System.out.println("STATICCOUNTER: " + InstanceVsStaticVar.STATICCOUNTER); // 3
        System.out.println("instanceCounter: " + obj3.instanceCounter);    // 1

        // Show instance variable of obj1 again to illustrate it hasn't changed
        System.out.println("Instance counter of obj1: " + obj1.instanceCounter); // 1

        /**
         * System.out.println("STATICCOUNTER: " + InstanceVsStaticVar.STATICCOUNTER); // 1
         * here, "InstanceVsStaticVar" is calling the class, not  the constructor
         * the instance variable and static variable both are using the contructor in the same way
         * The value of the static variable (STATICCOUNTER) gets incremented each time a new instance of the class is created 
         * -because the constructor contains the code to increment the static variable.
         * he instance variable (instanceCounter) is specific to each instance and is initialized 
         * -and incremented independently for each new object.
         */
    }
}