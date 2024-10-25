import java.util.Random;

public class RandomValueGenerator {
	public static void main(String[] args) {
		
		//Instance of the Random class
		Random random = new Random();
		
		int x = random.nextInt();
		int y = random.nextInt(9)+1; // will print something with in the limit of 1-10
		double z = random.nextDouble();
		boolean a = random.nextBoolean();

		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		
	}
}
