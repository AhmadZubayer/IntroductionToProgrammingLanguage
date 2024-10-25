package package2;

import package1.AccessModifiers_ClassA;

public class subAccessModifiers_ClassA extends AccessModifiers_ClassA  {
	
	
	public static void main(String[] args) {
		subAccessModifiers_ClassA a = new subAccessModifiers_ClassA();
        // System.out.println(a.noModifierText); Not accessible
        System.out.println(a.publicText);
        // System.out.println(a.privateText); // Not accessible
        System.out.println(a.protectedText);
    }
}
