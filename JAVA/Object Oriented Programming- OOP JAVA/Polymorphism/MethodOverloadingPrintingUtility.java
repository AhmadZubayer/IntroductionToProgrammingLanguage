
public class MethodOverloadingPrintingUtility {
	//prints given int i
    public void myPrint(int i) {
            System.out.println("int i = " + i);
    }
    //prints given double d
    public void myPrint(double d) { //same name, different parameter
       System.out.println("double d = " + d);
    }
    
    public static void main(String args[]) {
       MethodOverloadingPrintingUtility printingUtility = new MethodOverloadingPrintingUtility();
       printingUtility.myPrint(5);
       printingUtility.myPrint(5.0); //call same method name with different argument type
    }
}
