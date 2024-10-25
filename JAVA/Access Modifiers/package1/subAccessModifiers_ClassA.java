package package1;



public class subAccessModifiers_ClassA extends AccessModifiers_ClassA  {
	
	
	public static void main(String[] args) {
		subAccessModifiers_ClassA a = new subAccessModifiers_ClassA();
        System.out.println(a.noModifierText); 
        // noModifierText would not be accessible if this class was located in a different package
        System.out.println(a.publicText);
        // System.out.println(a.privateText); // Not accessible
        System.out.println(a.protectedText);
    }
}
