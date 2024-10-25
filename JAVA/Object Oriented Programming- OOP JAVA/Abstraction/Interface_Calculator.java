import java.util.Scanner;

// Define the interface
interface Calculator {
    void askUser();
    void takeInput();
    void doAddition(double a, double b);
    void doSubtraction(double a, double b);
    void doMultiplication(double a, double b);
    void doDivision(double a, double b);
}

// Implement the interface in the class
class HowToCalculate implements Calculator {
    @Override
    public void askUser() {
        System.out.println("Enter two numbers to perform calculations:");
    }

    @Override
    public void takeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scan.nextDouble();
        System.out.print("Enter second number: ");
        double b = scan.nextDouble();
        
        // Perform calculations
        doAddition(a, b);
        doSubtraction(a, b);
        doMultiplication(a, b);
        doDivision(a, b);
        
        scan.close();
    }

    @Override
    public void doAddition(double a, double b) {
        double result = a + b;
        System.out.println("Addition result: " + result);
    }

    @Override
    public void doSubtraction(double a, double b) {
        double result = a - b;
        System.out.println("Subtraction result: " + result);
    }

    @Override
    public void doMultiplication(double a, double b) {
        double result = a * b;
        System.out.println("Multiplication result: " + result);
    }

    @Override
    public void doDivision(double a, double b) {
            double result = a / b;
            System.out.println("Division result: " + result);
    }
}

// Main class 
public class Interface_Calculator {
    public static void main(String[] args) {
        HowToCalculate calculator = new HowToCalculate();
        calculator.askUser();
        calculator.takeInput();
    }
}
