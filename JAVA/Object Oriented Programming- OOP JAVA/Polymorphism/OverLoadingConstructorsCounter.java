
public class OverLoadingConstructorsCounter {

int count;
	
	//constructors
	
	/**
	 * Creates a counter and starts internal count at given start value.
	 * @param start
	 */
	public OverLoadingConstructorsCounter(int start) {
		this.count = start;
	}
	
	/**
	 * Creates a counter and starts internal count at 0.
	 */
	public OverLoadingConstructorsCounter() {
		this.count = 0;
	}

	public static void main(String[] args) {
	
		OverLoadingConstructorsCounter counter1 = new OverLoadingConstructorsCounter(2);
		System.out.println(counter1.count);
		
		OverLoadingConstructorsCounter counter2 = new OverLoadingConstructorsCounter();
		System.out.println(counter2.count);

	}
}
