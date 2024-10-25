
public class StaticVarMethod_CircleArea {
	public static double PI = 3.1416;

    public static double calculateArea(double radius) { 
         return PI*radius*radius;
    }

    public static void main(String[] args){
        
        // this can be done if the static variable is in the same class
        System.out.println("Area of Circle:" + calculateArea(5.55));

        // this can be done if the static variable is NOT in the same class
        // this should be done when the static method is used from other class
        System.out.println("Area of Circle:" + StaticVarMethod_CircleArea.calculateArea(6.55));

    }

}
