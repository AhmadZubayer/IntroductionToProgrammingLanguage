// DISCLAIMER: This class is connected to AccessModifiers_ClassA(this package- default) & AccessModifiers_ClassC (package2)
package package1;

public class AccessModifiers_ClassB {
    public static void main(String[] args) {
        AccessModifiers_ClassA a = new AccessModifiers_ClassA();
        System.out.println(a.noModifierText);
        System.out.println(a.publicText);
        // System.out.println(a.privateText); // Not accessible
        System.out.println(a.protectedText);
    }
}
