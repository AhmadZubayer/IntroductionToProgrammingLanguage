import java.util.ArrayList;

/**
 * Use the enhanced for loop when you simply need to access each element of an array or collection without modifying them.
 * It’s especially useful for traversing arrays or collections.
 * If you need explicit control over the iteration (e.g., modifying elements, skipping certain elements), stick with the traditional for loop.
 * For straightforward iteration, the enhanced for loop offers simplicity and readability.
 */

public class EnhancedForLoop {
       
	public static void main(String[] args) {
		
		String[] cars = {"Lexus", "BMW", "Porshe", "Audi", "Marcedes"};
		
		for(String i: cars) {
			System.out.println(i);
		}
		
		
		System.out.println("-------------------------------------------");
		
		ArrayList<String> Volkswagen = new ArrayList();
		Volkswagen.add("Volkswagen");
		Volkswagen.add("Audi");
		Volkswagen.add("Porshe");
		Volkswagen.add("Lamborghini");
		
		for(String i : Volkswagen) {
			System.out.println(i);
		}
	}
}
