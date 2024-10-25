/*
 * ACCESS MODIFIER
 * Access Levels:
 * ----------------Class     Package      Subclass      World (Anywhere)
 * public            Y          Y            Y               Y
 * package           Y          Y            Y               N
 * no modifier       Y          Y            N               N
 * private           Y          Y            N               N
 * 
 * DISCLAIMER: 
 * This class is connected to AccessModifiers_ClassB(this package- default) & AccessModifiers_ClassC (package2)
 */
package package1;

import package2.*;

public class AccessModifiers_ClassA {
    String noModifierText = "This text is only visible to Class A & Class B";
    public String publicText = "This text is visible to Class A, Class B, and classes in package2";
    private String privateText = "This text is only visible to Class A";
    protected String protectedText = "This text is visible to Class A, Class B, and subclasses in package2";
    
    public static void main(String[] args) {
        AccessModifiers_ClassA a = new AccessModifiers_ClassA();
        System.out.println(a.noModifierText);
        System.out.println(a.publicText);
        System.out.println(a.privateText);
        System.out.println(a.protectedText);
    }
}

