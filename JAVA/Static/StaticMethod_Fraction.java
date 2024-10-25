
public class StaticMethod_Fraction {
	// Instance variables
    int numerator;
    int denominator;

    // Static method to compute the greatest common divisor (GCD)
    public static int gcd(int a, int b) {
        // Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    /**If a method doesn't need to access or modify instance variables 
     * (numerator and denominator in this case), it can be made static. 
     * In the gcd method example, the calculation of the greatest common divisor (gcd) of two numbers 
     * (a and b) does not require any information specific to a particular StaticMethod_Fraction instance.
     */

    // Main method to demonstrate the usage of the gcd method
    public static void main(String[] args) {
        // Example numbers to find the GCD of
        int num1 = 24;
        int num2 = 36;

        // Calculate GCD using the static gcd method
        int result = StaticMethod_Fraction.gcd(num1, num2);

        // Output the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
