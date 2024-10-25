class MultiFunctionClass {
    // Instance variables
    private int value1;
    private String value2;

    // Default constructor
    MultiFunctionClass() {
        value1 = 0;
        value2 = "Default";
    }

    // Parameterized constructor with two arguments
    MultiFunctionClass(int v1, String v2) {
        value1 = v1;
        value2 = v2;
    }

    // Method to calculate the sum of two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to concatenate two strings
    String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Method to display instance variable values
    void displayValues() {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        MultiFunctionClass obj1 = new MultiFunctionClass();
        MultiFunctionClass obj2 = new MultiFunctionClass(42, "Hello");

        // Calling methods
        int sumResult = obj1.add(10, 20);
        String concatResult = obj2.concatenate("Java", "World");

        // Displaying results
        System.out.println("Sum: " + sumResult);
        System.out.println("Concatenated String: " + concatResult);

        // Displaying instance variable values
        obj1.displayValues();
        obj2.displayValues();
    }
}
