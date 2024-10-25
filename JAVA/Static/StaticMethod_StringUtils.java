
public class StaticMethod_StringUtils {
	// Static helper method to check if a string is empty
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static void main(String[] args) {
        // Declare and initialize the first boolean variable
        // call a static method directly using the class name.
        boolean result1 = StaticMethod_StringUtils.isEmpty("Hello");
        System.out.println("Is string empty: " + result1);

        // Declare and initialize the second boolean variable
        boolean result2 = StaticMethod_StringUtils.isEmpty("");
        System.out.println("Is string empty: " + result2);

        //Just like static variables, there's no need to create an instance of a class to call a static method
    }
}
