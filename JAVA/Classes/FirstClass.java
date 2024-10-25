import java.util.Scanner;
        /**
        * my first Java Class
        * Ahmad Zubayer
        * From Coursera 
        * @param args
        */

public class FirstClass {
	    /**
	     * Main Method
	     * This is the main entry point to any Java program
	     * @param args
	     */
	
	

	public static void main(String[] args) {
		// Printing using SOPL: System.out.printn
		System.out.println("Hello World!");
		System.out.println();  // print a blank line
		
		int x= 5;
		double y= 5.0;
		boolean flag= true;
		System.out.println("x: " + x);
		System.out.println("Y:"  + y);
		System.out.println("flag: " + flag);
		
		/*
		 * Strings and characters
		 */
		
		String dept= "cit";  // String;
		char letter = 'a';   // char
		
		String course = dept + 500; // string with int
        String grade= letter + "";  // char with string
        String courseInformation = course + ": " + grade;
        System.out.println(courseInformation);
        
        /*
         * Math Operations
         */
        double d = 2 * x + 10;
        double z= 2 * y + 5;
        System.out.println();
        System.out.println("d: " + d);
        System.out.println("z: " + z);
        
        // divison with int
        // uses integer division and ignores the remainder
        System.out.println("x/2: " + (x/2));
        
        // divison with float
        System.out.println("x/2.0: " + (x/2.0));
        
        //Power operation
        System.out.println("x pow 4: " + Math.pow(x,4));
        
        /*
        *String Operations
        */
        
        // String concatenation
        String fullName = "Ahmad" + " " + "Zubayer" + " " + "Mostafa";
        System.out.println("Full Name: " + fullName);
        String fullName1 = "Ahmad Zubayer Mostafa";
        System.out.println("Full Name1: " + fullName1);
        
        // String method for converting to uppercase
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Full Name Upper: " + fullNameUpper);   
        
        /*
         * Conditionals and Loops
         */
        System.out.println();
        System.out.println("x: " + x);
        if (x % 2 ==0) {
        	System.out.println(x + " is even. ");
        } else {
        	System.out.println(x + " is odd. ");
        }
        
        double e= 2.3;
        double f= 2.4;
        double g= 2.5;
        // boolean operators
        // && (and)- true only if both operators are true
        System.out.println();
        if (e>2 && e<f) {
        	System.out.println(e + " is between 2 and " + f);
        }
        
        // || (or)- true if either operand is true
        if (f>e || f>g) {
        	System.out.println(f + " is grater than " + e + " or grater than " + g);
        }
        // ! (not)- reverses the truth value of its one operand
        if (g != 2.6) {
        	System.out.println(g + " is not equal to 2.6");
        }
        
        // while loops
        System.out.println();
        int i=0;
        while (i<5) {
        	System.out.println("i: " +i);
        	i++;
        }
        
        // for loops
        System.out.println();
        for (int j=0; j<10; j++) {
        	System.out.println("j: " + j);
        }
        
        /*
         * Casting: From one data type to another
         */
        
        // Cast int to String
        String intToString = Integer.toString(1);
        
        // Cast double to string
        String doubleToString = Double.toString(1.1);
        
        // print the values and type of values
        System.out.println();
        System.out.println(intToString + " " + intToString.getClass() );
        System.out.println(doubleToString + " " + doubleToString.getClass() );
        
        // cast string to int
        int stringToInt = Integer.parseInt("1");
        
        // cast string to double
        double stringToDouble = Double.parseDouble("1.1");
        
        // print
        System.out.println(stringToInt);
        System.out.println(stringToDouble);
        // int, double, float, char, short, long, boolean, byte 
        // are 8 PRIMITIVE data types, not OBJECTS 
        // so, these do not have any getClass() method
        //  so, cast to object then call getClass()
        System.out.println(((Object)stringToInt).getClass());
        System.out.println(((Object)stringToDouble).getClass());
        
        
        /*
         * USER INPUT
         */
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a Number");
        int myInt = scan.nextInt();  // get next input as int
        System.out.println("Your Number is: " + myInt);
        
        // print the multiplication table up to 10 for myInt
        for (int t=0; t<11; t++) {
        	System.out.println(t+ " x " + myInt + " = " + (t*myInt));
        }
        
        System.out.println();
        System.out.println(" Enter a String: ");
        String myString = scan.next(); // get next input value as String
        // print each char in myString separately
        for (int u=0; u<myString.length(); u++) {
        	System.out.println(myString.charAt(u));
        }
        scan.close();
	}

}
