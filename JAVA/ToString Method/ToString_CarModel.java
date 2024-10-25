class CarModel {


 String make = "Porche";
 String model = "Cayane";
 String color = "Black";
 int year = 2024;
 
 public String toString() {
   return make +"\n"+model+"\n"+color+"\n"+year;
  } 
}

public class ToString_CarModel {
	 public static void main(String[] args) {
		  
		  // toString() = special method that all objects inherit, 
		  //    that returns a string that "textually represents" an object.
		  //    can be used both implicitly and explicitly
		  
		  CarModel car = new CarModel();
		  
		  
		  System.out.println(car.toString()); //Explicitly Called
		  System.out.println();
		  System.out.println(car); // Implicitly Called
		  
		  // If System.out.println(car); was used directly without toString(), 
		  // the output would be the memory location of the object car.
		  // for example: CarModel@372f7a8d

		    
		 }
}
