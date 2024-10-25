

// Final class: Cannot be subclassed
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

// Class with final method, variable, and parameter
class FinalKeyword{
    
    // Final instance variable
    final double PI;

    // Constructor to initialize the final variable
    public FinalKeyword(double value) {
        this.PI = value;
    }

    // Final method: Cannot be overridden
    public final void displayFinalMethod() {
        System.out.println("This is a final method.");
    }

    // Method with final parameter
    public void displayFinalParameter(final int parameter) {
        System.out.println("The final parameter value is: " + parameter);
        
        
        // parameter = parameter + 1; COMPILE ERROR!
    }
}

public class Keyword_final {
    public static void main(String[] args) {
        // Create an instance of FinalKeywordDemo
        FinalKeyword example = new FinalKeyword(3.1416);
        
        // Display the final variable
        System.out.println("The final variable value is: " + example.PI);
        
        // Call the final method
        example.displayFinalMethod();
        
        // Call the method with final parameter
        example.displayFinalParameter(10);

        // Create an instance of FinalClass and call its method
        FinalClass finalClass = new FinalClass();
        finalClass.display();
    }
}
