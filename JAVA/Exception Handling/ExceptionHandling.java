// Check if an alphabet is Vowel or Consonant
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;

        try {
            System.out.print("Enter an English alphabet: ");
            input = scan.nextLine();

            if (input.length() != 1) {
                throw new Exception("Please enter only one character.");
            }

            char ch = input.charAt(0);
            if (!Character.isLetter(ch)) {
                throw new Exception("Invalid input. Please enter an English alphabet.");
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant."); 

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scan.close();
    }
    

}
