
public class StaticVarMethod_ValidNum {
  
	// Returns true if x is valid
    public static boolean isValid(int x) {
        return StaticVarMethod_ValidNum.isGreaterThanZero(x) && StaticVarMethod_ValidNum.isEven(x);
    }

    // Returns true if x is greater than 0
    public static boolean isGreaterThanZero(int x) {
        return (x > 0);
    }

    // Returns true if x is even
    public static boolean isEven(int x) {
        return (x % 2 == 0);
    }

    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 0;
        
        // Check if number1 is valid
        boolean isValidNumber1 = StaticVarMethod_ValidNum.isValid(number1);
        System.out.println(number1 + " is valid: " + isValidNumber1);

        // Check if number2 is valid
        boolean isValidNumber2 = StaticVarMethod_ValidNum.isValid(number2);
        System.out.println(number2 + " is valid: " + isValidNumber2);

        //there's no need to create an object instance to use them.
    }
}
