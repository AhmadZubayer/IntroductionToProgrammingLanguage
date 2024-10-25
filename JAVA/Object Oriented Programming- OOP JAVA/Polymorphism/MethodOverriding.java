/*
 * METHOD OVERRIDING
 * If the Circle class did not have its own draw method,
 * It would inherit the draw method from the Shape class.
 * When myCircle.draw() is called, it prints "Drawing a shape.".
 *
 * In this case below, the Circle class overrides the draw method.
 * When myCircle.draw() is called,
 * It prints "Drawing a circle" because the draw method in the Circle class takes priority.
 * over the inherited draw method from the Shape class
 */

// Superclass
class Shape {
    // Method to be overridden
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass
class Circle extends Shape {
    // Overriding the draw method
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating an object of the superclass
        Shape myShape = new Shape();
        myShape.draw(); // Output: Drawing a shape

        // Creating an object of the subclass
        Circle myCircle = new Circle();
        myCircle.draw(); // Output: Drawing a circle. || Overriding occurs here. 

    }
}

