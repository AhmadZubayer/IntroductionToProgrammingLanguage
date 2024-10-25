import java.util.Scanner;

public class PrintfMethod {
	public static void main(String[] args) {
		
		/**
		 * Basic format System.out.printf("%_ _", object/variable/value)
		 * a precision tool for formatting and presenting output
		 * Outputs a formatted string, where data from additional arguments is inserted into placeholders marked by % symbols.
		 */
		
		int     intVal    = 50;
		double  doubleVal = 50.5;
		char    charVal   = '@';
		boolean boolVal   = true;
		String  stringVal = "java";
		
		System.out.printf("%d \n", intVal);
		System.out.printf("%f \n", doubleVal);
		System.out.printf("%c \n", charVal);
		System.out.printf("%b \n", boolVal);
		System.out.printf("%s \n", stringVal);
		
		// WIDTH
		String s = "Hello Java";
		// %10s specifies that the string should be right-justified within a field of 10 characters.
		System.out.printf("%10s ", s);  
		// 8 leading spaces (at the left), because "Hello Java" has a length of 10 characters, which is less than 20.
		System.out.printf("%20s ", s);
		// the string already has a length of 10 characters, which exceeds the specified width of 7. 
		// Therefore, no padding or truncation occurs, and the entire string is displayed as is.
		System.out.printf("%7s ", s);
		System.out.printf("%s \n", s);
		
		
		System.out.printf("Hello %10s ", stringVal);  // Output: Hello _ _ _ _ _ _ Java
		System.out.printf("Hello %-10s ", stringVal); // Output: Hello Java _ _ _ _ _ _
		
		//Precision
		System.out.printf("%.2f \n", doubleVal);
		System.out.printf("%.5f \n", doubleVal);
		System.out.printf("The Value of pi is: %.4f \n", 22.0 / 7);
		
		//FLAGS
		// Left-Justify
		// The - flag left-justifies the output within the specified field width.
	    // Java _ _ _ _ _ _ 
		System.out.printf("%-10s \n", stringVal);
		// The + flag adds a plus (+) or minus (-) sign for numeric values.
		System.out.printf("%+d \n" , 42);
		// The 0 flag zero-pads numeric values.
		System.out.printf("%05d \n", 123); //00123
		// The , flag adds a comma as a grouping separator for numbers greater than 1000.
		System.out.printf("%,d  \n", 1234567);

		
		//EXTRAS
		double scientificVal = 1.23e6;
		System.out.printf("%.2e \n", scientificVal); // Output: 1.23e+06
		
		int hexVal = 255;
		System.out.printf("Hexadecimal: %x \n", hexVal); // Output: Hexadecimal: ff
		System.out.printf("Octal: %o \n", hexVal);       // Output: Octal: 377

		
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		int [][] matrix = new int [3][3];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Values of 3x3 Matrix");
        for (int i=0; i<matrix.length; i++) {
        	for(int j=0; j<matrix[i].length; j++) {
        		System.out.printf("Enter Element at postion %d, %d : ", i, j);
                matrix[i][j] = scan.nextInt();
        	}
        }
        
        System.out.println("MATRIX: ");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
        System.out.println();

        
        
        
        scan.close();
	}
 	
}
