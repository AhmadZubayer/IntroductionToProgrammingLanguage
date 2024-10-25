// Coursera Penn Engineering

import java.util.Arrays; // required for methods
public class Array{
    /**
     * An array is a way to store a collection of items, as a single unit
     * Arrays are defined with a fixed number of slots, each of which holds an individual item
     * You can add and delete items from those slots as needed
     * Each item in an array is distinguished by a numerical index between 0 and the array size minus 1
     * This works exactly the same as list indexing in Python
     * Arrays can contain any type of element value (primitive types or Objects), but you can't store different types in a single array
     * You can have an array of ints, an array of Strings, or even an array of arrays, but you can't
     * have an array that contains, for example, both Strings and ints
     * An array itself, is an Object
     */
    public static void main (String[]args){

        // create an array
        int [] myArrayOfInts;
        // This declares an array of Strings:
        String[] myArrayofStrings;
        // Imagine we have a Customer class. This declares an array of Customers:
        // Customer[] myArrayOfCustomers;

        // declare and create instance of array of 10 Strings
        String[] names = new String[10];
        
        // This creates a new array of ints with 99 slots
        int[] temps; //declare array
        temps = new int[99]; //create instance of array with 99 slots

        // indexing starts at 0
        // This creates an array of 3 doubles and sets the values
        double[] myDoubleArray = new double[3];
        myDoubleArray[0] = 5.0; //sets 1st value to 5.0
        myDoubleArray[1] = 4.1; //sets 2nd value to 4.1
        myDoubleArray[2] = 3.9; //sets 3rd value to 3.9
        System.out.println(Arrays.toString(myDoubleArray));

        // This creates an array of 2 booleans and sets the values
        boolean[] myBoolArray = new boolean[2];
        myBoolArray[1] = true; //sets 2nd value to true
        myBoolArray[0] = false; //sets 1st value to false
        System.out.println(Arrays.toString(myBoolArray));
        //Note, if you use an index outside of 0 up to myArray.length ‐ 1, you’ll get an 'ArrayIndexOutOfBoundsException'

        
        int[] num = {1,2,3,4,5,6,7,8,9};
        /**
         *  The syntax above can only be used in the array declaration. You can’t do this:
             int[] composites;
            composites = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20}; //illegal */  


        // length of an array
        // This array of ints has a length of 10
        int[] scores = new int[10];
        System.out.println(scores.length); //length of 10

        /**length is an instance variable, not a method
        ‐ On the other hand, Strings have a length() method
        - Arrays cannot be easily resized
        ‐ You’d have to create a new array, copy everything from the old array, and add the new
          elements to the new array 
          */    

        // this creates an array of ints with actual prime numbers
        int[] primes = {2, 3, 5, 7, 11, 13, 19};
             for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
         }
        // don't do this: for (int i=0; i<10; i++) {...}

        // This creates an array of Strings, with actual programming languages
        String[] languages = {"Java", "C", "C++"};
        //ENHANCED FOR LOOP
        System.out.println();
        for (String language : languages) {
            System.out.println(language);
        }

        String[] greetings = {"Hello World", "Bye World", "Good Morning World", "Goodnight World"};
        System.out.println();
        for (String g : greetings) {
            System.out.println("O_o: " + g);
        }

        
        // DEFAULT VALUES
        int [] count = new int [10];   // Every value of this array is default to 0;
        System.out.println();
        for (int i = 0; i < count.length ; i++) {
            count[i] = i+1;
            System.out.print(count[i]+ " ");
        }

        double [] doubleCount = new double [10];   // Every value of this array is default to 0.0;
        System.out.println();
        for (int i = 0; i < doubleCount.length ; i++) {
            doubleCount[i] = i+1;
            System.out.print(doubleCount[i] + " ");
        }

        // COPYING ARRAYS
        /**
         * This does not copy the elements of array a to b. 
         * Instead, it makes b refer to the same array object that a refers to.
         * Any changes made to the elements of a will also reflect in b 
         * because both a and b point to the same array in memory.
         */
       
        int[] a = {1,8,9};    
        int[] b = new int [a.length];
        b = a;
        
        // Print
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
         }
        System.out.println(); 
        System.out.print("REFER ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
         }
        
        //Set b = a
        //This does NOT copy elements of a to b
        //It only makes b refer to same array object [1, 8, 3]
        System.out.println();
        System.out.println( a == b); // true


        // COPYING ARRAY ELEMENTS
        /**This explicitly copies each element from array c to array d.
         * d is a separate array from c, 
         * so changes to one array will not affect the other.
         */
        

        int[] c = {3,6,9};
        int[] d = new int [c.length];
        // Copy elements of a to b
        for (int i=0; i<a.length; i++) {
            d[i] = c[i];
        }
        
        // print
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
         }
        System.out.println(); 
        System.out.print("COPY ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
         }

        
        // Compare the objects
        System.out.println();
        System.out.println( c == d);  // false
        
        // Compare the elements
        System.out.println(Arrays.equals(c, d)); // true

        // CLONING
        /**
         * creates entirely a new object
         * This creates a new array f that is a shallow copy of array e
         * f is a new array with the same elements as e, but it's a different object. 
         * Changes to one array will not affect the other.
         */
        
        int[] e = {7,8,9};
        // Clone elements of e to f
        int[] f = e.clone();
        
        //Print
        System.out.println();
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
         }
        System.out.println(); 
        System.out.print("CLONED ");
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
         }

        // Compare the objects
        System.out.println();
        System.out.println( e == f);  // false
        // Compare the elements
        System.out.println(Arrays.equals(e, f)); // true

        // ARRAYS TO STRING METHOD
        System.out.println();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
       
          
    

    }
}