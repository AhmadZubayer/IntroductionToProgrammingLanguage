import javax.swing.JOptionPane;
import java.lang.Math;

public class FirstGUI {
	
	public double BMI (double weight, double height) {
		double heightMeter = height/3.241;
		return weight / Math.pow(heightMeter, 2);  // body mass index
	}
	
	public static void main(String[] args) {
		FirstGUI bmi = new FirstGUI();  // Create an instance of FirstGUI
		
		String name = JOptionPane.showInputDialog("Enter Your Name:");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		/*
		 * when the showInputDialog box is used, it will return a String.
		 * But showInputDialog is assigned to age which is an integer variable. 
		 * So showInputDialog has to be casted to Int
		 */
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age " + name + ": "));
		JOptionPane.showMessageDialog(null, "Hello " + name + "\n" + "You are " + age +  " years old.");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height " + name + ": "));
		JOptionPane.showMessageDialog(null, "Hello " + name + "\n" + "You are " + age +  " years old." + "\n" +  "Your height is " + height + "feet");
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Weight  " + name + " (in KG): "));
		JOptionPane.showMessageDialog(null,
				      "Hello " + name + "\n" + 
		              "You are " + age +  " years old." + "\n" +  
				      "Your height is " + height + "feet" + "\n" +
		              "Your Weight is " + weight + "KG" + "\n" + 
				      "Your Body Mass Index (BMI) is " + bmi.BMI(weight, height) + "Kg/Sq meter.");
		
		
		
	}

}
