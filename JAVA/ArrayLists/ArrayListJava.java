import java.util.ArrayList; 
import java.util.Scanner;
import java.util.Collections;

public class ArrayListJava {

	    public static void main(String [] args) {

	        //Arraylist < Data type > myArrayList = new Arraylist <Data type> (); 
	        
	    	ArrayList<Integer> myArrayList1 = new ArrayList<Integer>();
	        ArrayList<String> myArrayList2  = new ArrayList<String>();

	        ArrayList<Integer> scores = new ArrayList<Integer>();
	        scores.add(0);
	        scores.add(20);
	        scores.add(30);
	        scores.add(40);
	        scores.add(50);
	        System.out.println(scores.size());  //size is a method

	        ArrayList<String> cars = new ArrayList<String>();
	        cars.add("Volvo");
	        cars.add("BMW");
	        cars.add("Ford");
	        cars.add("Mazda");
	        System.out.println(cars);
	        System.out.println(cars.size()); //4
	        
	        cars.add(0, "Porche"); // Insert element at the beginning of the list (0)
	        cars.add(2, "Lexus");  // does not replace, inserts/adds
	        System.out.println(cars);
	        System.out.println(cars.size()); //6

	        cars.set(0, "Lucid");
	        System.out.println(cars);
	        System.out.println(cars.size()); //6

	        cars.remove(3);
	        System.out.println(cars);
	        System.out.println(cars.size()); //5

	        System.out.println(cars.get(2)); //Lexus

	        for (int i = 0; i < cars.size(); i++) {
	            System.out.println(cars.get(i));
	        }

	        Collections.sort(cars);  // Sort cars
	        System.out.println();
	        for (String i : cars) {
	             System.out.println(i);
	        }

	        // example
	        ArrayList<Double> myDoubles = new ArrayList<Double>();
	        myDoubles.add(33.56);
	        myDoubles.add(15.20);
	        myDoubles.add(15.10);
	        myDoubles.add(15.15);
	        myDoubles.add(0.0);
	        myDoubles.add(12.0);
	        System.out.println();
	        System.out.println(myDoubles);
	        Collections.sort(myDoubles);  // Sort myDoubles
	        for (double i : myDoubles) {
	            System.out.println(i);
	        }
	        
	        myDoubles.clear();
	        System.out.println(myDoubles);
	        


	    }
}

