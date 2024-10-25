
public class MethodOverloadingCalculator {

	// Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with different parameter type
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloadingCalculator calc = new MethodOverloadingCalculator();
        
        // Compiler chooses the appropriate method based on arguments
        int sum1 = calc.add(3, 4); // Calls add(int, int)
        double sum2 = calc.add(2.5, 3.5); // Calls add(double, double)
        int sum3 = calc.add(1, 2, 3); // Calls add(int, int, int)
        
        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);
  }
}
