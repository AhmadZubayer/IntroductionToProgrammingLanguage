
public class OverLoadingConstructorsPoint {
	int x;
	int y;
	int sum;

	//constructors
	
	public OverLoadingConstructorsPoint(int x, int y) {
		this.x = x;
		this.y = y;
		this.sum = x + y;
	}
	
	
	public OverLoadingConstructorsPoint() {
		//calls first constructor with default values, 0 and 0
		this(0, 0);
		//this(3, 5);
	}
	
	public static void main(String[] args) {
		
		OverLoadingConstructorsPoint point1 = new OverLoadingConstructorsPoint(2, 4);
		System.out.println(point1.x);
		System.out.println(point1.y);
		System.out.println(point1.sum);
		
		System.out.println();

		OverLoadingConstructorsPoint point2 = new OverLoadingConstructorsPoint();
		System.out.println(point2.x);
		System.out.println(point2.y);
		System.out.println(point2.sum);
		
	}
}
