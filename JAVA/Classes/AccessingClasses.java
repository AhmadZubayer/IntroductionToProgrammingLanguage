class OuterClass {
    class InnerClass {
        void display() {
            System.out.println("This is an inner class.");
        }
    }
}

public class AccessingClasses {
    public static void main(String[] args) {
        
        // create an instance of the OuterClass called outer
        OuterClass outer = new OuterClass();

        
        OuterClass.InnerClass inner = outer.new InnerClass(); // Using Dot Operator
        inner.display();
    }
}
