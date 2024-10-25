/*
 * ABSTRACTON
 * 
 * Abstract class: is a restricted class that cannot be used to create objects 
 * (to access it, it must be inherited from another class).
 * 
 * Abstract method: can only be used in an abstract class, and it does not have a body. 
 * The body is provided by the subclass, thus making overriding compulsory.
 * 
 * abstraction is achieved by interfaces and abstract classes
 * 
 * Data abstraction is the process of hiding certain details and 
 * showing only essential information to the user.
 * It helps in maintaining and understanding the code easily by hiding the complex logic.
 * 
 * abstract methods in abstract classes provide a way to define common interfaces
 * 
 * WHEN TO USE ABSTRACTIONS:
 * When you have a base class that should not be instantiated directly, 
 * but should serve as a template for other classes.
 * 
 * When you want to ensure that certain methods are implemented by all subclasses.
 * 
 * When you want to provide some common functionality to all subclasses, 
 * but leave specific details to be implemented by the subclasses.
 * 
 */


abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();
    
    // Regular method
    public void sleep() {
        System.out.println("The animal is sleeping...");
    }
}

class Dog extends Animal {
    // Providing the implementation of the abstract method
    public void sound() {
        System.out.println("Dog is barking");
    }
}

public class Abstraction_animal {
	public static void main(String[] args) {
		
		// Animal animal = new Animal();
		// Cannot be  instantiated
		
        Dog dog = new Dog();
        dog.sound(); 
        dog.sleep(); 
    }
}
