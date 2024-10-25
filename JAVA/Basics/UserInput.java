import java.util.Scanner;

public class UserInput{
    public static void main (String[]args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter Something:");
        String myString = scan.nextLine();
        System.out.println("You Entered: " + myString);

        System.out.println();
        System.out.println("Enter a double:");
        double myDouble = scan.nextDouble();
        System.out.println("You Entered: " + myDouble);
        System.out.println("MULTIPLICATION TABLE OF " + myDouble);
        for (int i=0; i< 10; i++) {
            System.out.println(myDouble + " x " + i + " = " +   myDouble * i );
        }
        //scan.close();

        scan.nextLine(); 
        // after reading the double, the newline character generated by pressing Enter remains in the input buffer.
        // Add this line to consume the newline character
        // this reads the leftover newline character from the input buffer and effectively consumes it.
        // properly waits for new user input, rather than mistakenly reading the leftover newline character.
        System.out.println("Enter Something:");
        String myString2 = scan.nextLine();
        System.out.println("You Entered: " + myString2);
        for (int u=0; u<myString2.length(); u++) {
        	System.out.println(myString2.charAt(u));
        }
        scan.close();


        
    }
}