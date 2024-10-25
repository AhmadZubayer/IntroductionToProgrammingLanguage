// DISCLAIMER: This class is connected to AccessModifiers_ClassA & AccessModifiers_ClassB located in package1.

package package2;
import package1.*;



public class AccessModifiers_ClassC {
	
	
    public static void main(String[] args){
        AccessModifiers_ClassA a = new AccessModifiers_ClassA();
        // System.out.println(a.noModifierText); // Not accessible
        System.out.println(a.publicText);
        // System.out.println(a.privateText); // Not accessible
        // System.out.println(a.protectedText); // Not accessible
    }
}
