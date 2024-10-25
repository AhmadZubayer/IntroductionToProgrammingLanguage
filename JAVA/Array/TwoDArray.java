import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] table = new int[3][2];
        System.out.println("Size of table: " + table.length + "x" + table[0].length);

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        // Access Elements
        System.out.println();
        System.out.println(myNumbers[1][2]);

        // Change Values
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        // Print with FOR LOOP
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }

        // Print with ENHANCED FOR LOOP
        char[][] myCharArr = {{'A', 'B', 'C', 'D'}, {'E', 'F', 'G', 'H'}, {'I', 'J', 'K', 'L'}};
        // Print with FOR LOOP
        System.out.println(); 
        for (int i = 0; i < myCharArr.length; ++i) {
            for (int j = 0; j < myCharArr[i].length; ++j) {
                System.out.print(myCharArr[i][j] + " ");
            }
            System.out.println(); 
        }
        // Print with ENHANCED FOR LOOP
        System.out.println(); 
        for (char[] row : myCharArr) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println(); // To move to the next line after each row
        }

        // Total Elements in an Array
        int totalElements = 0;
        for (int i = 0; i < myCharArr.length; ++i) {
            totalElements += myCharArr[i].length;
        }       
        System.out.println("Total number of elements in the array: " + totalElements);

        //Print Default Value
        double [][] doubleArr = new double [3][3];
        int count = 1;
        for (int i = 0; i < doubleArr.length; i++) { //get the length of the rows (vertical)
                for (int j = 0; j < doubleArr[i].length; j++) { //get the length of the columns (horizontal)
                     doubleArr[i][j] = count++; //set count value in each array slot, then increment
                }
            }
        System.out.println(); 
        for (double[] row : doubleArr) {
            for (double c : row) {
                System.out.print(c + "  ");
            }
            System.out.println(); // To move to the next line after each row
        }

        // Comparison
        int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr3 = {{9,8,7},{6,5,4},{3,2,1}};
        System.out.println();
        System.out.println(Arrays.deepEquals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr3));  

        //Input from User
        // Addition of two 2D Arrays
        Scanner scan = new Scanner (System.in);
        System.out.println();
        System.out.println("Enter Number of Rows of Matrix");
        int rows = scan.nextInt();
        System.out.println("Enter Number of Columns of Matrix");
        int columns = scan.nextInt();
        int[][] userArr = new int[rows][columns];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                System.out.printf("Enter Element at [%d][%d]: ", i, j);
                userArr[i][j] = scan.nextInt(); 
            }
        }
        System.out.println("YOUR ARRAY: ");
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                System.out.print(userArr[i][j] + " ");
            }
            System.out.println(); 
        }

        



            
    }
}
