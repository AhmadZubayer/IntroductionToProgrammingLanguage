import java.lang.*;

public class StringClass {
public static void main(String args[]) {
	
    String s1="HELLO java";
	String s2= new String();
	String s3 = new String("Hello");
	String s4 = "Hello";
	String s5 = new String("Hello");
	String s6 = "Hello";
	String s8=new String("JaVaClaSs");	
	
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());
	System.out.println(s1.length());
	System.out.println(s3.charAt(1));	
	System.out.println(s1.concat(s3));
	System.out.println(s1);
	System.out.println(s3);
	
	System.out.println();
	if(s3 == s5) {
	    System.out.println("yes");
	} else {
	    System.out.println("No");
	}
    
	System.out.println();
	boolean result = s3.equals(s5);
    System.out.println(result);
    boolean result2 = s1.equalsIgnoreCase("Hello Java");
    System.out.println(result2);
    
    
    System.out.println();
    String s7 = s1.substring(2,7);//begin index is inclusive end index is exclusive
	System.out.println(s7);
	System.out.println(s1);
	s1 = s1.substring(3,7);
	System.out.println(s1); 
	s8=s8.toLowerCase();
	System.out.println(s8);	
	
	String s9 = "Hello String";
	System.out.println();
	String upperCaseString = s9.toUpperCase();
    System.out.println(upperCaseString); 
    
    System.out.println();
    String trimmedString = "   Hello String     ".trim();
    System.out.println(trimmedString);
    
    System.out.println();
    String replacedString = s9.replace('o', 'a');
    System.out.println(replacedString); 
    
    System.out.println();
    boolean containsHello = s9.contains("hello");
    System.out.println(containsHello);
    
    System.out.println();
    boolean startsWithHello = s1.startsWith("Hello");
    System.out.println(startsWithHello);
    
    System.out.println();
    boolean endsWithString = s9.endsWith("String");
    System.out.println(endsWithString);
    
    System.out.println();
    int index = s9.indexOf('o');
    System.out.println(index);
    
    System.out.println();
    int lastIndex = "JAVA".lastIndexOf('A');
    System.out.println(lastIndex);
    
    System.out.println();
    int comparison = "java".compareTo("JAVA"); // Unicode diff: 106(j)-74(J) = 32
    System.out.println(comparison);
    int comparison2 = "JAVA".compareTo("JAVA"); // Unicode diff: 74(J)-74(J) = 0
    System.out.println(comparison2);            
    int comparison3 = "JAVA".compareTo("JAvA"); // Unicode diff: 86(V)-118(v) = -32
    System.out.println(comparison3);
    int comparison4 = "JAVA".compareTo("JAWA"); // Unicode diff: 85(W)-86(V) = -1
    System.out.println(comparison4);
    
    System.out.println();
    String[] parts = "Hello,World,String,Java".split(",");
    for (String part : parts) {
        System.out.println(part);
    }
    
    
    
    
       
       }
}