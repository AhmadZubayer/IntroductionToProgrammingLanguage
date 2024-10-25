
public class WrapperClass {

	public static void main(String[] args) {

		/*
		  Wrapper Class
		  Provides a way to use primitive data types as reference data types
		  reference data types contain useful methods that can be used with collections

		  Autoboxing
		  The automatic conversion that the Java compiler makes from primitive to their corresponding wrapper class

		  Unboxing
		  The reverse of Autoboxing.
		  Wrapper Class to Primitive data types
		 */

		Integer   i = 123;
		Double    d = 123.12;
		Boolean   b = true;
		Character c = 'c';
		String    s = "Java";
		
		// Integer
		//-----------------------------------------------------------------------------------------------------
		System.out.println("intValue: " + i.intValue()); // Output: 123
		System.out.println("Equality: " + i.equals(123));
		System.out.println("byteValue: " + i.byteValue());
		System.out.println("longValue: " + i.longValue());
		System.out.println("floatValue: " + i.floatValue());
		System.out.println("doubleValue: " + i.doubleValue());
		System.out.println("Comparison Result: " + i.compareTo(321));
		System.out.println("Comparison Result: " + i.compareTo(012));
		System.out.println("Comparison Result: " + i.compareTo(123));	
		
		// STATIC methods
		System.out.println("compare(i,321) = " + Integer.compare(i, 321));
		System.out.println("compare(i,012) = " + Integer.compare(i, 012));
		System.out.println("compare(i,123) = " + Integer.compare(i, 123));
		System.out.println("Binary: " + Integer.toBinaryString(i));
		System.out.println("Hexaddecimal: " + Integer.toHexString(i));
        System.out.println("Octal: " + Integer.toOctalString(i));
        System.out.println("Max Value: " + Integer.MAX_VALUE); // The largest value that an int can represent.
        System.out.println("Min Value: " + Integer.MIN_VALUE); // The lowest value that an int can represent.
        
        String ddecimal = "45";
        String octal = "005";
        String hex = "0x0f";
        Integer ddec = Integer.decode(ddecimal);
        System.out.println("decode(45) = " + ddec);
        ddec = Integer.decode(octal);
        System.out.println("decode(005) = " + ddec);
        ddec = Integer.decode(hex);
        System.out.println("decode(0x0f) = " + ddec);
        
        
        
        System.out.println("DOUBLE METHODS ---------------------------------------------------------------------------------");
        // Declaring and initializing
        // double and String values
        
        double dd = 55.05;
        String ss = "45";
 
        // Method - toString()
        System.out.println("toString(dd) = " + Double.toString(dd));
 
        // Method - valueOf()
        // Return Double object
        System.out.println("valueOf(dd) = " + Double.valueOf(dd));
        System.out.println("ValueOf(ss) = " + Double.valueOf(ss));
 
        // Method - parseDouble()
        // Return primitive double value
        System.out.println("parseDouble(ss) = " + Double.parseDouble(ss));
 
        // Construct two Double objects
        Double x = new Double(dd);
        Double y = new Double(ss);
        // Print statements
        System.out.println("bytevalue(x) = " + x.byteValue());
        System.out.println("shortvalue(x) = " + x.shortValue());
        System.out.println("intvalue(x) = " + x.intValue());
        System.out.println("longvalue(x) = " + x.longValue());
        System.out.println("doublevalue(x) = " + x.doubleValue());
        System.out.println("floatvalue(x) = " + x.floatValue());
 
        System.out.println("hashcodde(x) = " + x.hashCode());
        System.out.println("x.equals(y) = " + x.equals(y));
        System.out.println("compare(x,y) = " + Double.compare(x, y));
        System.out.println("x.compareTo(y) = " + x.compareTo(y));
 
        Double ddd = Double.valueOf("1010.54789654123654");  
        // creates a Double object from the string "1010.54789654123654"
        System.out.println("isNaN(ddd) = " + ddd.isNaN());
        // dd.isNaN() checks if the Double object ddd is “Not-a-Number” (NaN). 
        // Since 1010.54789654123654 is a valid number, this will print false.
 
        System.out.println("Double.isNaN(45.12452) = " + Double.isNaN(45.12452));
        // checks if the primitive double 45.12452 is NaN. 
        // This will also print false because 45.12452 is a valid number.
        
        // Double.POSITIVE_INFINITY stores
        // the positive infinite value
        ddd = Double.valueOf(Double.POSITIVE_INFINITY + 1);
        System.out.println("Double.isInfinite(ddd) = "+ Double.isInfinite(ddd.doubleValue()));
        // Double.POSITIVE_INFINITY represents positive infinity.
        // Adding 1 to positive infinity still results in positive infinity.
        // double.valueOf(Double.POSITIVE_INFINITY + 1) creates a Double object representing positive infinity.
        // Double.isInfinite(dd.doubleValue()) checks if the value of ddd is infinite. 
        // This will print true.
          
        double dddd = 10245.21452;
        System.out.println("Double.toString(ddd) = " + Double.toHexString(dddd));
 
        long double_to_long = Double.doubleToLongBits(dddd);
        System.out.println("Double.doubleToLongBits(ddd) = " + double_to_long);
 
        double long_to_double = Double.longBitsToDouble(double_to_long);
        System.out.println( "Double.LongBitsToDouble(double_to_long) = " + long_to_double);
        
        // Double.toHexString(dddd) converts the double 10245.21452 to its hexadecimal string representation.
        // Double.doubleToLongBits(dddd) converts the double dddd to its IEEE 754 floating-point “double format” bit layout, which is a long value.
        // Double.longBitsToDouble(double_to_long) converts the long bits back to the original double value.
        
        
        System.out.println();
        System.out.println("BOOLEAN METHODS ---------------------------------------------------------------------------------");
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("false");
        System.out.println(b1 + " " + b2 + " " + b3);
        boolean val = b1.booleanValue();
        System.out.println(val);
        
        
        Boolean b4 = new Boolean(true);
        Boolean b5 = new Boolean(false);
        
        // Compares two object
        //  0, if true
        //  1, if larger
        // -1, if smaller
        int result = b4.compareTo(b5);
        System.out.println(result);
        
        // Checks if both object are equal.
        System.out.println(b1.equals(b4));
        System.out.println(b4.equals(b5));
        
        // returns the hash code for the Boolean object b4, b5
        System.out.println(b4.hashCode());
        System.out.println(b5.hashCode());
        
        // parses the string "true"/"false" and returns the primitive boolean value true/false
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("false"));
        
        // converts the Boolean object, b4 to a string representation.
        System.out.println(b4.toString());
        
        

	}

}
