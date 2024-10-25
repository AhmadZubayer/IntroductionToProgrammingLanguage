import java.util.ArrayList;

public class TwoDArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> carBrands = new ArrayList();
		
		ArrayList<String> Volkswagen = new ArrayList();
		Volkswagen.add("Volkswagen");
		Volkswagen.add("Audi");
		Volkswagen.add("Porshe");
		Volkswagen.add("Lamborghini");
		
		ArrayList<String> Toyota = new ArrayList();
		Toyota.add("Toyota");
		Toyota.add("Lexus");
		Toyota.add("Crown");
		Toyota.add("Daihatsu");
		
		ArrayList<String> Marcedes = new ArrayList();
		Marcedes.add("Marcedes Benz");
		Marcedes.add("AMG");
		Marcedes.add("Mayback");
		Marcedes.add("G-Wagen");
		
		ArrayList<String> BMW = new ArrayList();
		BMW.add("3 Series");
		BMW.add("5 Series");
		BMW.add("X5");
		BMW.add("M3");
		
		carBrands.add(Volkswagen);
		carBrands.add(Toyota);
		carBrands.add(Marcedes);
		carBrands.add(BMW);
		
		System.out.println(carBrands);
		System.out.println(carBrands.get(0));
		System.out.println(carBrands.get(0).get(2	));
		

		
		
	}

}
